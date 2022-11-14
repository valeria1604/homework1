package com.company.examclouds.lesson05;

import java.util.Scanner;

//HOMEWORK удалить сканеры
public class Task {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        int a = Integer.parseInt(line);
        task01(a);

        a = scan.nextInt();
        task02(a);

        a = scan.nextInt();
        task0304(a);

        task05();

        task06();

        task07();
        task0702();

        task09();

    }

    private static void task09() {
        int a = (int) (0 + (Math.random() * 10));
        int b = a;
        int factorial = b;
        while (b != 1) {
            b = b - 1;
            factorial = factorial * b;

        }
        System.out.println(a + "!  = " + factorial);
    }

    private static void task07() {
        char symbol = 'h';
        for (int i = 0; i < 5; i++) {
            System.out.print(symbol++);

        }
        System.out.println();
    }
    private static void task0702() {

        for (char symbol = 'h'; symbol < 'h'+5; symbol++) {
            System.out.print(symbol);
        }
        System.out.println();
    }

    private static void task06() {
        int i = 0;
        do {
            if (i % 5 == 0) {
                System.out.println("Делится на 5 без остатка " + i);
            }
            i++;
        }
        while (i <= 100);
    }

    private static void task05() {
        int i = 0;
        while (i < 11) {
            System.out.println("Task " + i);
            i++;
        }
    }



    private static void task01(int b) {
        if (b % 2 != 0) {
            System.out.println("Является нечётным " + b);
        } else {
            System.out.println("Является чётным " + b);
        }
    }

    private static void task02(int a) {

        if (a < 10 && a >= 0) {
            System.out.println("Положительное число меньше 10 или ноль");
        } else {
            System.out.println("Положительное число больше 10 или отрицательное");
        }
    }

    private static void task0304(int a) {
        switch (a) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Субота");
                break;
            case 7:
                System.out.println("Неделя");
                break;

        }
    }
}

