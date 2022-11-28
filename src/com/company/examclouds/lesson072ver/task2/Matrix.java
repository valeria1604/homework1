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

    public Matrix multiplyByNumber(int b) {
        Matrix result = new Matrix(new int[rows][columns]);

        for (int row = 0; row < result.rows; row++) {
            for (int column = 0; column < result.columns; column++) {
                result.numbers[row][column] = numbers[row][column] * b;
            }
        }
       return result;
    }

    public Matrix multiply(Matrix matrixB) {
        Matrix result = new Matrix(new int[rows][matrixB.columns]);

        int suma=0;
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < matrixB.columns; column++) {
                for (int i = 0; i < matrixB.rows; i++) {
                    suma += numbers[row][i] * matrixB.numbers[i][column];
                }
                result.numbers[row][column] = suma;
                suma = 0;
            }
        }
       return result;
    }
    @Override
    public String toString() {
        return Arrays.deepToString(numbers);
    }
}
