package org.shark.common.names;

import lombok.Data;

@Data
public class Dog {
    /**名字**/
    private String name;
    /**颜色**/
    private String color;
    /**年龄**/
    private int age;
    /**体重**/
    private float weightInKg;
}
