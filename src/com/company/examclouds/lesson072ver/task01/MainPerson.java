package com.company.examclouds.lesson072ver.task01;

public class MainPerson {
    public static void main(String[] args) {
        Person firstPerson = new Person();
        Person secondPerson = new Person("Aleksandr", 32);
        Person.talk(secondPerson.fullName, secondPerson.age);

    }
}
