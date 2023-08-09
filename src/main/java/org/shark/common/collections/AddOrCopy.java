package org.shark.common.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collections提供了多个用于复制、添加、替换集合中元素的api
 */
public class AddOrCopy {
    public static void main(String[] args) {
        List<String> users = new ArrayList<>(List.of("Ana","Billy","Denys","John","Nancy"));
        List<String> usersCopy = new ArrayList<>(List.of("Blank","Blank","Blank","Blank","Blank","Blank"));
        //拷贝集合元素到目标集合,但是目标集合的大小必须大于等于源集合的大小
        Collections.copy(usersCopy,users);
        System.out.println(usersCopy);
        //将某个值复制多份组合为一个新的集合
        List<String> copies = Collections.nCopies(3, "John");
        System.out.println(copies);
        //替换集合中的所有项为某个特定的值
        Collections.fill(users,"Shark");
        System.out.println(users);
        //将集合中的某个元素替换为某个特定的值
        Collections.replaceAll(usersCopy,"Blank","Shark");
        System.out.println(usersCopy);
        //添加元素到集合的末尾
        Collections.addAll(usersCopy,"Tom","Rose");
        System.out.println(usersCopy);
    }
}
