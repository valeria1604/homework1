package com.company.ppj.ppj07;

import java.util.Scanner;


public class ex1 {
    public static void main(String[] args) {
        int max1;
        int max2;
        int input;
        Scanner scanner = new Scanner(System.in);
        input = scanner.nextInt(); //1
        max1 = input;

        input = scanner.nextInt();  //2
        if (input > max1) {
            max2 = max1;
            max1 = input;
        } else {
            max2 = input;
        }
        input = scanner.nextInt(); //3
        if (input > max1) {
            max2 = max1;
            max1 = input;
        } else if (input > max2) {
            max2 = input;
        }
        input = scanner.nextInt(); //4
        if (input > max1) {
            max2 = max1;
            max1 = input;
        } else if (input > max2) {
            max2 = input;
        }
        input = scanner.nextInt(); //5
        if (input > max1) {
            max2 = max1;
            max1 = input;
        } else if (input > max2) {
            max2 = input;
        }
        System.out.println("max1:" + max1);
        System.out.println("max2:" + max2);

    }
}
