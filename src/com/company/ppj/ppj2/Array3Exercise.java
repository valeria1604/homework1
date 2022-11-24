package com.company.ppj.ppj2;

import java.util.Arrays;

public class Array3Exercise {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 2, 6};

        int rows = max(arr);
        int columns = arr.length;

        String [][] result = new String[rows][columns];
        for(int row = 0; row < rows; row++){
            for(int column = 0; column <columns; column++){
                if(row < arr[column]){
                    result[row][column] = "*";
                }
                else{
                    result[row][column] = " ";
                }
            }
        }

        for(int i=0; i< rows; i++){
            for(int y = 0; y<columns; y++){
                System.out.print(result[i][y]);
            }
            System.out.println();
        }


    }

    private static int max(int[] arr) {
        int max = 0, min = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (i == 0) {
                max = arr[i];
                min = arr[i];
            } else {
                if (arr[i] < arr[i + 1]) {
                    if (max < arr[i + 1]) {
                        max = arr[i + 1];
                    }
                    if (min > arr[i]) {
                        min = arr[i];
                    }
                } else {
                    if (max < arr[i]) {
                        max = arr[i];
                    }
                    if (min > arr[i + 1]) {
                        min = arr[i + 1];
                    }
                }
            }
        }
        return max;
    }
}
