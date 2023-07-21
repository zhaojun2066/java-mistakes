package org.shark.common.shortcuts;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

import static java.util.Arrays.sort;

public class Shortcuts {
    private String[] persons = new String[0];

    private   void errors() {
        //(windows)alt + enter  (mac) option + enter
        //首先这里是引用的类型是不对的
        // HashMap泛型是多余的，这里是有警告的，我需要去掉,那么可以接受idea的建议
        HashMap<Integer, String> maps = new HashMap<>();
    }

    private void lambdas(){
        //即使没有错误和代码警告或者建议
        //1 删除冗余的参数
        //2 改方法体的方式
        //3 改为匿名类的方式
        Function<Function, Function> f = function -> function.compose(function);

        //将lambda表达式 替换为方法引用的方式
        //Arrays.sort方法引用，此处的代码会更加的简洁
        sort(persons, String::compareToIgnoreCase);

        //改为foreach的形式呢
        IntStream.range(0, persons.length).filter(i -> i % 2 == 0).mapToObj(i -> persons[i]).forEach(System.out::println);


    }

}
