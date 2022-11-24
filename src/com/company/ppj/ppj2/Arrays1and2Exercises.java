package com.company.ppj.ppj2;

public class Arrays1and2Exercises {
    public static void main(String[] args) {
        int[] a = {10, 9, 1, 7, 4, 2, 5, 2, 34, 5, 8, 1};
        firstExercise(a);
        secondExercise(a);

    }

    private static void firstExercise(int[] a) {
        int max = 0, min = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (i == 0) {
                max = a[i];
                min = a[i];
            } else {
                if (a[i] < a[i + 1]) {
                    if (max < a[i + 1]) {
                        max = a[i + 1];
                    }
                    if (min > a[i]) {
                        min = a[i];
                    }
                } else {
                    if (max < a[i]) {
                        max = a[i];
                    }
                    if (min > a[i + 1]) {
                        min = a[i + 1];
                    }
                }
            }
        }
        System.out.println("Min: " + min);
        System.out.println("Max: "+ max);
        System.out.println("Result: " + (max-min));

    }

    private static void secondExercise(int[] a) {
        int max = 0, min = 0;
        int placeOfMax = 0;
        int placeOfMin = 0;
        for (int i = 0; i < a.length - 1; i++) {
            if (i == 0) {
                max = a[i];
                min = a[i];
                placeOfMin = i;
            } else {
                if (a[i] < a[i + 1]) {
                    if (max < a[i + 1]) {
                        max = a[i + 1];
                        placeOfMax = i+1;
                    }
                    if (min > a[i]) {
                        min = a[i];
                        placeOfMin = i;
                    }
                } else {
                    if (max < a[i]) {
                        max = a[i];
                        placeOfMax = i;
                    }
                    if (min > a[i + 1]) {
                        min = a[i + 1];
                        placeOfMin = i+1;
                    }
                }
            }
        }

        System.out.println("Min: " + min);
        System.out.println("Max: "+ max);
        System.out.println("Place of min" + placeOfMin);
        System.out.println("Place of max" + placeOfMax);
        a[placeOfMax] = min;
        a[placeOfMin] = max;
        System.out.println(java.util.Arrays.toString(a));

    }
}