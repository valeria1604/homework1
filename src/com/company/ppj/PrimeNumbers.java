package com.company.ppj;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int x = scanner.nextInt();
            boolean isPrime = true;
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("This is prime number");
            } else {
                System.out.println("This is not prime number");
            }
        }
    }

}
