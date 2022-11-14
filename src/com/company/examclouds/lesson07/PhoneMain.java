package com.company.examclouds.lesson07;

public class PhoneMain {
    public static void main(String[] args) {
        Phone firstPhone = new Phone(1010101, 34, "A-400");
        Phone secondPhone = new Phone(2020202, 35, "B-400");
        Phone thirdPhone = new Phone(330303030, 36, "C-400");
        Phone fourthPhone = new Phone(404040404, "D-400");

        fourthPhone.setWeight(37);

        System.out.println(firstPhone);
        System.out.println(secondPhone);
        System.out.println(thirdPhone);
        System.out.println(fourthPhone);

        Phone.receiveCall("Анатолий");
        System.out.println("Номер: " + firstPhone.getNumber());
        Phone.receiveCall("Андрей", 3030303);
        System.out.println("Номер: " + secondPhone.getNumber());
        Phone.receiveCall("Александр");
        System.out.println("Номер: " + thirdPhone.getNumber());
    }
}
