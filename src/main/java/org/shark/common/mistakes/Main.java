package org.shark.common.mistakes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        modificationException();
    }

    /**
     * 在循环中修改集合
     * 在这里涉及两个属性  AbstractList里的modCount ，这个属性代表你对集合的修改次数，增删都会+1
     * ArrayList 内部类 中 Iterator的实现类Itr中的 expectedModCount属性 ，
     * 默认不在循环中进行修改的话，modCount会+1，且exceptedCount = modCount 这两个值是永远相等的
     * 如果在循环内进行修改，那么modCount会+1，但是exceptedModCount 还是原来的值，
     * 如果这两个值不相等，那么就会抛出java.util.ConcurrentModificationException
     *
     */
    private static void  modificationException() throws InterruptedException {
        List<String> words = new ArrayList<>(
                Arrays.asList("a","b","c","d")
        );
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            if (next.equals("b")){
                iterator.remove();
            }
        }

        words.forEach(word->{
            if (word.equals("b")){
                //删除
                words.remove(word);
                //增加
              //  words.add("e");
            }
        });

        Thread.sleep(Long.MAX_VALUE);
    }
}