package com.company.ppj.ppj11;

//           *
//           *
//           * *
//          ** *
//          ** *
//          ** *
//          ****
//         *****

public class Array3Exercise {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 2, 6};

        int rows = max(arr);
        int columns = arr.length;

        String[][] result = fillMatrix(arr, rows, columns);

        for (int row = rows - 1; row >= 0; row--) {
            for (int column = 0; column < columns; column++) {
                System.out.print(result[row][column]);
            }
            System.out.println();
        }
    }

    private static String[][] fillMatrix(int[] arr, int rows, int columns) {
        String[][] result = new String[rows][columns];
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                if (row < arr[column]) {
                    result[row][column] = "*";
                } else {
                    result[row][column] = " ";
                }
            }
        }
        return result;
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
}
