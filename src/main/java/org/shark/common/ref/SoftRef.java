package org.shark.common.ref;
import java.lang.ref.SoftReference;
public class SoftRef {
    public static void main(String[] args) {
        //初始化一个软引用，并放入一个10M大小的byte数组
        SoftReference<byte[]> softReference = new SoftReference<byte[]>(new byte[1024*1024*10]);
       //接着从软引用中获取，并打印
        System.out.println(softReference.get());
        //手动触发GC
        System.gc();
        //再次从软引用中获取，并打印
        System.out.println(softReference.get());
        //再次初始化一个10M大小的byte数组，此时堆内存已经没有地方了
        byte[] bytes = new byte[1024 * 1024 * 10];
        //最后从软引用中获取，并打印
        System.out.println(softReference.get());
    }
}
