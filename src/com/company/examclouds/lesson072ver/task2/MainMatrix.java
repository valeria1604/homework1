package com.company.examclouds.lesson072ver.task2;

import java.util.Arrays;

public class MainMatrix {
    public static void main(String[] args) {
        // version01();
        int[][] a = {{2, 3, 6}, {4, 5, 8}, {4, 8, 2}, {5, 7, 1}};
        Matrix fifthMatrix = new Matrix(a);
        System.out.println(fifthMatrix.getColumns());
        System.out.println(fifthMatrix.getRows());
        System.out.println(fifthMatrix);
        fifthMatrix.printMatrix();

    }

    private static void version01() {
        Matrix firstMatrix = new Matrix(2, -3, 1, 5, 4, -2, 2, 3);
        Matrix secondMatrix = new Matrix(4, 2, -5, -4, 1, 3, 2, 3);

        System.out.println(Arrays.deepToString(firstMatrix.getNumbers()));
        System.out.println(Arrays.deepToString(secondMatrix.getNumbers()));
        Matrix.suma(firstMatrix, secondMatrix);
        Matrix.mnozhenieNaChislo(firstMatrix, 2);

        Matrix thirdMatrix = new Matrix(1, 2, 3, 1, 2, 2);
        Matrix fourthMatrix = new Matrix(-1, 3, 1, 1, 2, 2);
        Matrix.mnozhenie(thirdMatrix, fourthMatrix);
    }
}
