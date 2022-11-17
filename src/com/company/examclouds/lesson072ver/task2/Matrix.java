package com.company.examclouds.lesson072ver.task2;

import java.util.Arrays;

public class Matrix {
    private int[][] numbers;
    private int columns;
    private int rows;

    public Matrix(int x1, int x2, int x3, int x4, int x5, int x6, int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        numbers = new int[][]{{x1, x2, x3,}, {x4, x5, x6}};
    }

    public Matrix(int x1, int x2, int x3, int x4, int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        numbers = new int[][]{{x1, x2}, {x3, x4}};
    }

    public Matrix(int[][] src) {
        rows = src.length;
        columns = src[0].length;
        numbers = new int[rows][columns];
        for (int row = 0; row < rows; row++) {
            numbers[row] = new int[columns];
            System.arraycopy(src[row], 0, numbers[row], 0, columns);
        }
    }


    public static void suma(Matrix a, Matrix b) {
        int[][] result = new int[2][3];
        for (int lines = 0; lines < 2; lines++) {
            for (int columns = 0; columns < 3; columns++) {
                result[lines][columns] = a.getNumbers()[lines][columns] + b.getNumbers()[lines][columns];
            }
        }
        System.out.println(Arrays.deepToString(result));
    }

    public static void mnozhenieNaChislo(Matrix a, int b) {
        int[][] result = new int[2][3];
        for (int lines = 0; lines < 2; lines++) {
            for (int columns = 0; columns < 3; columns++) {
                result[lines][columns] = a.getNumbers()[lines][columns] * b;
            }
        }
        System.out.println(Arrays.deepToString(result));
    }

    public static void mnozhenie(Matrix a, Matrix b) {
        int[][] result = new int[2][2];
        for (int lines = 1; lines < 3; lines++) {
            for (int columns = 1; columns < 3; columns++) {
                result[lines][columns] = ((a.getNumbers()[lines][columns] * a.getNumbers()[lines][columns]) + (a.getNumbers()[lines][columns + 1] * b.getNumbers()[lines - 1][columns]));
            }
        }
        System.out.println(Arrays.deepToString(result));
    }

    public void printMatrix() {
        for (int row = 0; row < rows; row++) {
            System.out.println(Arrays.toString(numbers[row]));
        }

    }

    public int[][] getNumbers() {
        return numbers;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return Arrays.deepToString(numbers);
    }
}
