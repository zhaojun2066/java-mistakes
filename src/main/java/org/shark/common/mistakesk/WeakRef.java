package org.shark.common.mistakesk;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class WeakRef {
    public static void main(String[] args) {
        //初始化一个弱引用
        WeakReference<byte[]> weakReference = new WeakReference<byte[]>(new byte[1]);
        //获取并打印
        System.out.println(weakReference.get());
        //手动触发GC
        System.gc();
        //再次获取并打印

        System.out.println(weakReference.get());


        ReferenceQueue queue = new ReferenceQueue();
        PhantomReference<byte[]> reference = new PhantomReference<byte[]>(new byte[1], queue);
        System.out.println(reference.get());

    }
}
