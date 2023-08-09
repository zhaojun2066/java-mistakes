package org.shark.common.objects.utility;


import java.util.Objects;

/**
 * 如何安全的比较对象
 */
public class EqualsObject {
    record User(String username){}

    public static void main(String[] args) {
        User nullUser = null;
        User shark = new User("Shark");
        User sharkCopy = new User("Shark");
        User tom = new User("Tom");
        try {
            //但是这段代码是有问题的，会出现空指针异常
            nullUser.equals(shark);//NPE
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }

        //或者你可以这样写,但是这样写的代码不是很优雅
        if (nullUser!=null){
            nullUser.equals(shark);
        }
        //安全的做法如下：这个方法的内部将判断nullUser是否为null，不为null 才会进行相应的比较操作
        System.out.println(Objects.equals(nullUser, sharkCopy));//false
        System.out.println(Objects.equals(shark,tom));//false
        System.out.println(Objects.equals(shark, sharkCopy));//true
        //这个record为啥会返回true
        //这是因为record类在生成 equals 方法时，默认会比较所有字段的值。
        // 这是由于record类的主要目的是表示不可变的数据对象，因此比较两
        // 个对象是否相等的标准是它们的字段值是否完全相同。

        //deepEquals
        User[] users1 = new User[]{shark,tom};
        User[] users2 = new User[]{shark,tom};
        //比较数据内容是否相同
        System.out.println(Objects.equals(users1,users2));//false
        //通过深度比较，这里会比较每个对象内部字段值都相等，那就会返回true
        System.out.println(Objects.deepEquals(users1,users2));//true



    }
}
