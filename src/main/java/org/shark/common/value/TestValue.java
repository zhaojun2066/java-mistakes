package org.shark.common.value;

import org.shark.common.names.Dog;

public class TestValue {


    public static void main(String[] args) {

//        Long v = 1000L;
//        Long v2 = 1000L;
//        System.out.println(v .equals(v2) );

        int value = 1;
        increment(value);
        System.out.println("main value: " + value);
        Dog dog = new Dog();
        dog.setAge(100);
        incrementDogAge(dog);
        System.out.println("main dog age: " + dog.getAge());
        newDog(dog);
        System.out.println("1000之后的 main dog: " + dog.getAge());
    }

   private static void incrementDogAge(Dog dog) {
    // 获取狗的年龄并加1
    int newAge = dog.getAge() + 1;
     // 更新狗的年龄
    dog.setAge(newAge);
     // 打印增加后的狗的年龄
    System.out.println("增加狗的年龄：" + dog.getAge());
}

    private static void newDog(Dog dog) {
        dog = new Dog();
        dog.setAge(1000);
        System.out.println("newDog age: " + dog.getAge());
    }

    private static void increment(int value) {
        value++;
        System.out.println("increment value: " + value);
    }

    private static long addLong(long a ,long b){
        return a + b;
    }


}
