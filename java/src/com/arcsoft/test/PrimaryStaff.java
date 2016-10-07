package com.arcsoft.test;

import com.arcsoft.staff.Staff;

class PrimaryStaff extends Staff {
    String department;
    public PrimaryStaff(String name, int age, int grade, String department) {
    	this.name = name;
		this.age = age;
		this.grade = grade;
		this.department = department;
    }
}
