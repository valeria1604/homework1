package com.company.examclouds.lesson05;

public class Taskkk {

    public static void main(String[] args) {
        //version01();
        //Посчитать суму квадратов чисел от 2 до 6 с do-while
        version2();
    }

    private static void version03() {
        int i = 2;
        int suma = 0;
        while (i <= 6){
            suma += i * i;
            i++;
        }
        System.out.println(suma);
    }
    private static void version2() {
        int i = 2;
        int suma = 0;
        do {
            suma += i * i;
            i++;
        } while (i <= 6);
        System.out.println(suma);
    }

    private static void version01() {
        int suma = 0;
        for (int i = 2; i <= 6; i++) {
            suma += i * i;
        }
        System.out.println(suma);
    }


}
