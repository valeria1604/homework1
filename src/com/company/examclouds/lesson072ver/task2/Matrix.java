package com.company.examclouds.lesson072ver.task2;

import java.util.Arrays;

public class Matrix {
    private int[][] numbers;
    private int columns;
    private int rows;

    public Matrix() {
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
    public Matrix suma(Matrix b) {
        Matrix result = new Matrix(new int[rows][columns]);

        for (int row = 0; row < result.rows; row++) {
            for (int column = 0; column < result.columns; column++) {
                result.numbers[row][column] = numbers[row][column] + b.numbers[row][column];
            }
        }
        return result;
    }

    public void suma(Matrix a, Matrix b) {
        Matrix result = new Matrix();
        result.rows = a.rows;
        result.columns = b.columns; //всё равно одинаковое количество должно быть, не важно a или b
        result.numbers = new int[result.rows][result.columns];
        for (int row = 0; row < result.rows; row++) {
            for (int column = 0; column < result.columns; column++) {
                result.numbers[row][column] = a.numbers[row][column] + b.numbers[row][column];
            }
        }
        System.out.println(result);
    }

    public static void mnozhenieNaChislo(Matrix a, int b) {
        Matrix result = new Matrix();
        result.rows = a.rows;
        result.columns = a.columns;
        result.numbers = new int[result.rows][result.columns];
        for (int row = 0; row < result.rows; row++) {
            for (int column = 0; column < result.columns; column++) {
                result.numbers[row][column] = a.numbers[row][column] * b;
            }
        }
        System.out.println(result);
    }

    public static void mnozhenie(Matrix a, Matrix b) {
        Matrix result = new Matrix();
        result.rows = a.rows;
        result.columns = b.columns;
        result.numbers = new int[result.rows][result.columns];
        int suma=0;
        for (int row = 0; row < a.rows; row++) {
            for (int column = 0; column < b.columns; column++) {
                for (int i = 0; i < b.rows; i++) {
                    suma += a.numbers[row][i] * b.numbers[i][column];
                }
                result.numbers[row][column] = suma;
                suma = 0;
            }
        }
        System.out.println(result);
    }

    public void setNumbers(int[][] src) {
        rows = src.length;
        columns = src[0].length;
        numbers = new int[rows][columns];
        for (int row = 0; row < rows; row++) {
            numbers[row] = new int[columns];
            System.arraycopy(src[row], 0, numbers[row], 0, columns);
        }
    }

    @Override
    public String toString() {
        return Arrays.deepToString(numbers);
    }
}
