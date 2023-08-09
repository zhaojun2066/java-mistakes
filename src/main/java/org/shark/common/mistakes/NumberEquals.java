package org.shark.common.mistakes;

import java.util.List;
import java.util.Objects;

public class NumberEquals {
    public static void main(String[] args) {
         equlasInteger(128,128);
    }
    /**
     * 集合内的元素乘以两倍然后将结果进行输出
     * @param numbers
     */
    private static void computerList(List<Integer> numbers){
       numbers.forEach(n-> System.out.println(n*2));
    }
    private static void equalsString(){
        String a = new String("shark");
        String b = new String("shark");
        System.out.println(a == b);
        System.out.println(a.equals(b));
        String c = "hello";
        String d = "hello";
        System.out.println(c == d);
    }

    private static void equlasInteger(Integer a, Integer b){
        System.out.println(a == b);
        System.out.println(Objects.equals(a,b));
        System.out.println(a.intValue() == b.intValue());
        System.out.println(a >= b);
    }


}
