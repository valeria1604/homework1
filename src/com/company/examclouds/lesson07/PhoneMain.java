package com.company.examclouds.lesson07;

import java.util.Scanner;

public class PhoneMain {
    public static void main(String[] args) {
        Phone firstPhone = new Phone(1010101, 34, "A-400");
        Phone secondPhone = new Phone(2020202, 35, "B-400");
        Phone thirdPhone = new Phone(330303030, 36, "C-400");
        Phone fourthPhone = new Phone(404040404, "D-400");

        fourthPhone.setWeight(37);

        //taskFrom1To8(firstPhone, secondPhone, thirdPhone, fourthPhone);
        task9();
    }

    private static void task9() {
        Phone.sendMessage(340404, 455666, 555666);
        Phone.sendMessage("404040", "303303", "4944", "5959595", "657775");
        //TODO убрать последнюю запятую, поставить точку
    }

    private static void taskFrom1To8(Phone firstPhone, Phone secondPhone, Phone thirdPhone, Phone fourthPhone) {
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
