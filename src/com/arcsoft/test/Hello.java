package com.arcsoft.test;

public class Hello{
    public static void main(String[] args) {
        PrimaryStaff lily = new PrimaryStaff("Lily", 25, 1, "Android");
        System.out.println(String.format(
        		"Hello, I'm %1$s,%2$d years old, grade %3$d, from department %4$s", 
        		lily.name, lily.age, lily.grade, lily.department));
    }
}
