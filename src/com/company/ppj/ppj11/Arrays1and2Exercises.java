package com.company.ppj.ppj11;

import java.util.Arrays;

public class Arrays1and2Exercises {
    public static void main(String[] args) {
        int[] array = {10, 9, 1, 7, 4, 2, 5, 2, 34, 5, 8};
        firstExercise(array);
        secondExercise(array);
    }

    private static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length - 1; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    private static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length - 1; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    private static void firstExercise(int[] array) {
        System.out.println(Arrays.toString(array));
        System.out.println("Min: " + min(array));
        System.out.println("Max: " + max(array));
        System.out.println("Result: " + (max(array) - min(array)));
    }

    private static void secondExercise(int[] array) {
        int indexMax = 0;
        int indexMin = 0;
        int maxNumber = max(array);
        int minNumber = min(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == minNumber) {
                indexMin = i;
            }
            if (array[i] == maxNumber) {
                indexMax = i;
            }
        }
        array[indexMax] = minNumber;
        array[indexMin] = maxNumber;
        System.out.println(Arrays.toString(array));
    }
}