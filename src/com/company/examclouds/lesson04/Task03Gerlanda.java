package com.company.examclouds.lesson04;

import java.util.Scanner;

public class Task03Gerlanda {
    //1 = 0001 = 2^0
    //2 = 0010 = 2^1
    //3 = 0011 = 2^2-1
    //4 = 0100
    //8 = 1000 = 2^3
    //15 = 1111 = 2^4-1
    //16= 10000 = 2^4
    //16*2 = 10 0000
    //32*2 = 64 = 100 0000
    //0111 1111 = 127 = 2^7-1
    //64*2 = 128 = 1000 0000 = 2^7
    //128 + 64 + 32 + 16 + 8 + 4 + 2 + 1 = 255 = 2^8-1 = 1111 1111
    public static void main(String[] args) {

        int maxInteger = (int) Math.pow(2, 31) - 1;
        int maxInteger2 = -257;

        //int x = 72; //1011100

        //System.out.println(Integer.toBinaryString(x));
        //printBinary(maxInteger2);
        //blink(x);
        //run(x);
        //isFirstLampOn(x);

        testBinaryAnd();
    }

    private static void testBinaryAnd() {
        System.out.println("Введите номер позиции");
        Scanner scanner = new Scanner(System.in);
        int poz = scanner.nextInt();
        //HOMEWORK
//https://webtechie.be/post/2019-10-25-the-mystery-of-the-negative-byte-value-in-java-a-story-of-bits-bytes-signed-and-unsigned/
        int a = 43;
        int b = (int) Math.pow(2, poz-1);
        int result = a&b;
        System.out.println(result);
        printBinary(result);
//     00101010 42
//   & 00001111 15
//     --------------
//     00001010 10


    }

    private static void printBinary(int x) {
        System.out.println(String.format("%32s", Integer.toBinaryString(x)).replace(' ', '0'));
    }

    public static void blink(int x) {
        x = ~x;
        printBinary(x);
    }

    public static void run(int x) {
        int result = x;
        for (int i = 0; i < 10; i++) {
            result = result << 1;
            printBinary(result);
        }
    }

    public static void isFirstLampOn(int x) {

        int a = 1;
        if ((a & x) == a) {
            System.out.println("Первая лампочка не горит");
        } else {
            System.out.println("Первая лампочка горит");
        }
    }
}
