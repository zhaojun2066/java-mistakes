package org.shark.common.crazy;

public class CrazyNumber {
    public static void main(String[] args) {
        int number = 0;
        for (int i = 0; i <100; i++) {
            number = number++;
        }
        System.out.println("Number: " + number);
    }
}
