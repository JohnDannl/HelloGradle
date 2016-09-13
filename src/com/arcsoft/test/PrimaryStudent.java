package com.arcsoft.test;

import com.arcsoft.school.Student;

class PrimaryStudent extends Student {
    String className;
    public PrimaryStudent(String name, int age, int grade, String className) {
        this.name = name;
	this.age = age;
	this.grade = grade;
	this.className = className;
    }
}
