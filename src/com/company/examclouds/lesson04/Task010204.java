package com.company.examclouds.lesson04;

import java.util.Scanner;

public class Task010204 {

    public static void main(String[] args) {
        //task01();
       // task02();
        task04();
    }

    private static void task01() {
        Scanner x = new Scanner(System.in);
        try {
            int a = x.nextInt();
            if(a%2==0) {
                System.out.println("Является чётным");
            }
            else {
                System.out.println("Является нечётным");
            }
        }
        catch(Exception e){
            System.out.println("Должно быть целое число.");
        }
    }

    private static void task02() {
        Scanner x2 = new Scanner(System.in);
        Scanner x3 = new Scanner(System.in);
        Scanner x4 = new Scanner(System.in);
        float b = x2.nextFloat();
        float c = x3.nextFloat();
        float d = x4.nextFloat();
        Float[] numbers = {b, c, d};
        float min = numbers[0];

        for (int i = 0; i < 2; i++) {
            if (abs(min) > abs(numbers[i + 1])) {
                min = numbers[i+1];
            }

        }
        System.out.println("Ответ:" + min);
    }

    public static float abs(float a){
        if (a < 0) {
            a = -a;
        }
        return a;
    }

    private static void task04() {
        Scanner x1 = new Scanner(System.in);
        String e = x1.nextLine();
        Scanner x2 = new Scanner(System.in);
        String g = x2.nextLine();
        Scanner x3 = new Scanner(System.in);
        String h = x3.nextLine();
        System.out.println("Среднее арифметическое:" + average(e, g, h));
    }

    public static double average(String a, String b, String c){
        double x = Double.parseDouble(a);
        double y = Double.parseDouble(b);
        double z = Double.parseDouble(c);

        return (x+y+z)/3;
    }


}

