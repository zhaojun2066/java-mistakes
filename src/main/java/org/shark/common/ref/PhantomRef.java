package org.shark.common.ref;

import lombok.Data;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.List;

public class PhantomRef {
    @Data //lombok 快速生成get set 方法
    public static class Tiger {
        private String name;

        @Override
        protected void finalize() throws Throwable {
            System.out.println("Tiger被回收了");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReferenceQueue queue = new ReferenceQueue();
        List<byte[]> bytes = new ArrayList<>();
        PhantomReference<Tiger> reference = new PhantomReference<Tiger>(new Tiger(), queue);
        //第一个线程
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                bytes.add(new byte[1024 * 1024]);
            }
        }).start();
        //第二个线程
        new Thread(() -> {
            while (true) {
                Reference poll = queue.poll();
                if (poll != null) {
                    System.out.println("虚引用被回收了：" + poll);
                }
            }
        }).start();
        Thread.sleep(Long.MAX_VALUE);
    }
}

