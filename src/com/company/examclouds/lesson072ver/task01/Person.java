package com.company.examclouds.lesson072ver.task01;

public class Person {
    public String fullName;
    public int age;

    public Person(String fullName, int age){
        this.fullName = fullName;
        this.age = age;
    }

    public Person(){
    }

    public static void talk(String name, int age){
        System.out.println(name + " которому "+ age + " лет говорит.");

    }
}
