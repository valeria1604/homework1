package com.company.examclouds.lesson072ver.task2;

public class MainMatrix {
    public static void main(String[] args) {

        int [][] a = {{2, 3}, {4, -1}};
        int [][] b = {{1, 0}, {5, -2}};
        Matrix firstMatrix = new Matrix(a);
        Matrix secondMatrix = new Matrix(b);
        System.out.println(firstMatrix);
        System.out.println(secondMatrix);

        System.out.println("Сума двух матриц");
        System.out.println(firstMatrix.suma(secondMatrix));
        int x = 3;
        System.out.println("Умножение на число на " + x );
        System.out.println(firstMatrix.multiplyByNumber(x));
        System.out.println("Умножение двух матриц");
        System.out.println(firstMatrix.multiply(secondMatrix));
    }
    }
