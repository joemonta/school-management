package com.joe.student;

import com.joe.address.Address;

public class StudentMain {

    private String student;

    public StudentMain(String student) {
        this.student = student;
    }

    public static void main(String[] args) {
        Address address = new Address();
        System.out.println(address.getAddress());
        System.out.println("In IntelliJ");
    }
}
