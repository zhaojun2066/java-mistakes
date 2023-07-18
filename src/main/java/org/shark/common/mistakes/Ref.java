package org.shark.common.mistakes;

import lombok.Data;

public class Ref {
    @Data //lombok 快速生成get set 方法
    public static class Tiger{
        private String name;
        @Override
        protected void finalize() throws Throwable {
            System.out.println("Tiger被回收了");
        }
    }
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger = null;
        System.gc();

    }
}
