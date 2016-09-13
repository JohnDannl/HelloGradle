package com.arcsoft.test;

public class Hello{
    public static void main(String[] args) {
        PrimaryStudent lily = new PrimaryStudent("lily", 12, 1, "119");
        System.out.println(String.format("Hello, I'm %1$s,%2$d years old, grade %3$d, from class %4$s", lily.name, lily.age, lily.grade, lily.className));
    }
}
