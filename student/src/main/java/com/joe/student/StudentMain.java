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
        System.out.println("Repository");
        System.out.println("Repository 2");
        System.out.println("InteellliJ");
        System.out.println("Repository 3");
        System.out.println("IntelliJ 4");
    }
}
