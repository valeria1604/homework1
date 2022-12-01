package com.company.ppj.ppj07;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int a1 = input;
        input = scanner.nextInt();
        int a2 = input;
        input = scanner.nextInt();
        System.out.println("Result 1: " + (a1 + a2 + input));

        a1 = a2;
        a2 = input;
        input = scanner.nextInt(); //4
        System.out.println("Result 2: " + (a1 + a2 + input));

        a1 = a2;
        a2 = input;
        input = scanner.nextInt(); //5
        System.out.println("Result 3: " + (a1 + a2 + input));

    }
}
