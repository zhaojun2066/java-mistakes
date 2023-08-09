package org.shark.common.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Collections对集合的排序
 * 元素必须要实现Comparable接口
 * 如果需要自定义比较，可以实现一个Comparator
 * 这里用String具体，String已经实现类Comparable接口
 */
public class Orders {
    public static void main(String[] args) {
        List<String> users = new ArrayList<>(List.of("Ana","Bob","Chris","John"));
        //相反顺序比较器
        Comparator<String> reverseComparator = (o1, o2) -> o2.compareTo(o1);
        //自然顺序进行排序
        Collections.sort(users);
        System.out.println(users);
        //相反循序进行排序
        Collections.sort(users,reverseComparator);
        System.out.println(users);
        //或者直接适用reverse方法进行相反顺序排序
        Collections.reverse(users);
        System.out.println(users);
        //对集合进行循环移动，正数向前移动，复数向后移动
        //下面是说向前移动1位
        Collections.rotate(users,1);
        System.out.println(users);
        //集合交换指定位置
        Collections.swap(users,1,2);
        System.out.println(users);
        //让集合进行随机打乱顺序
        Collections.shuffle(users);
        System.out.println(users);
    }
}
