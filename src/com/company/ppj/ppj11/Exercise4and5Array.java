package com.company.ppj.ppj11;

import java.util.Arrays;

public class Exercise4and5Array {
    public static void main(String[] args) {
        exercise4();
        exercise5();
    }

    private static void exercise4() {
        int[] arr = {1, 5, 8, 2, 6};
        int firstElement = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = firstElement;
        System.out.println(Arrays.toString(arr));
    }

    private static void exercise5() {
        int[] arr = {2, 3, 4, 3, 2, 6, 3, 6, 8, 2, 9};
        for (int y = 0; y < arr.length; y++) {
            boolean isDuplicate = false;
            for (int i = y + 1; i < arr.length; i++) {
                if (arr[y] == arr[i]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                System.out.print(arr[y] + " ");
            }
        }
    }
}

