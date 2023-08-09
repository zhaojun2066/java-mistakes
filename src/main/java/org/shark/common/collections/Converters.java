package org.shark.common.collections;

import java.util.*;

/**
 * 将集合转换为其他类型的集合
 */
public class Converters {
    public static void main(String[] args) {
        List<String> users = new ArrayList<>(List.of("Ana","Billy","Denys","John","Nancy"));
        //检查元素是否为String,防止集合内添加了不是String类型的元素
        List<String> strings = Collections.checkedList(users, String.class);
        System.out.println(strings);
        //提供传入集合的枚举
        Enumeration<String> e = Collections.enumeration(users);
        while(e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
        //返回不可修改的集合
        List<String> unmodifiableList = Collections.unmodifiableList(users);
        unmodifiableList.add("Shark");//这里会抛出异常
        //返回线程安全的集合
        Collections.synchronizedList(users);
        //返回一个不可修改的空集合
        List<Object> emptyList = Collections.emptyList();
        emptyList.add("Tom");//这里会抛出异常

    }
}
