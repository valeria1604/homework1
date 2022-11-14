package com.company.examclouds.lesson05;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        int x = 72; //1011100
        Scanner y = new Scanner(System.in);
        int number = y.nextInt();
        switch (number){
            case 1: blink(x);
            case 2: isFirstLampOn(x);
            case 3: run(x);
            case 4: printBinary(x);
        }

    }

    private static void printBinary(int x) {
        for(int i = 0; i<10; i++) {
            System.out.println(String.format("%32s", Integer.toBinaryString(x)).replace(' ', '0'));
        }
    }

    public static void blink (int x){
        x = ~x;
        printBinary(x);
    }
    public static void run(int x){
        int result = x;
        for (int i = 0; i<10; i++){
            result = result<<1;
            printBinary(result);
        }
    }
    public static void isFirstLampOn(int x){
        int a = 1;
        if((a&x) == a) {
            System.out.println("Первая лампочка не горит");
        }
        else{
            System.out.println("Первая лампочка горит");
        }
    }
}
