package org.shark.common.collections;

import java.util.Collections;
import java.util.List;

/**
 * 集合查找相关的功能
 */
public class Search {
    public static void main(String[] args) {
        //排好序的集合
        List<Integer> numbers = List.of(10,22,33,44,55);
        List<Integer> doubleNumbers = List.of(10,22,33,44,55, 10,22,33,44,55);
        List<Integer> someNumbers = List.of(33,44,55);
        List<Integer> otherNumbers = List.of(2,5,3);
        //二分查找法,如果查找到返回index值，没有找到则返回负数,这里要求集合必须是排序好的，而且元素要实现Comparable接口
        int index = Collections.binarySearch(numbers, 22);
        System.out.println(index);//1  索引从0 开始
        //查找最大值，元素要实现Comparable接口
        Integer max = Collections.max(numbers);
        System.out.println(max);//55
        //查找大小值，元素要实现Comparable接口
        Integer min = Collections.min(numbers);
        System.out.println(min);
        //查看出现频次
        int frequency = Collections.frequency(doubleNumbers,22);
        System.out.println(frequency); //2
        //返回包含目标someNumbers的所有元素的第一组匹配起始索引值，否则返回-1
        int firstIndex = Collections.indexOfSubList(doubleNumbers, someNumbers);
        System.out.println(firstIndex); //2
        //返回包含目标someNumbers的最后一组匹配起始索引值，否则返回-1
        int lastIndex = Collections.lastIndexOfSubList(doubleNumbers, someNumbers);
        System.out.println(lastIndex); // 7
        //查看集合是否无交集，如果有返回false，无，返回true
        boolean disjoint = Collections.disjoint(doubleNumbers, someNumbers);
        System.out.println(disjoint); // false

    }
}
