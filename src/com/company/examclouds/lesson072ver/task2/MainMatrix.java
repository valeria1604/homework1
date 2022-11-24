package com.company.examclouds.lesson072ver.task2;

public class MainMatrix {
    public static void main(String[] args) {

        int [][] a = {{2, 3}, {4, -1}};
        int [][] b = {{1, 0}, {5, -2}};
        Matrix firstMatrix = new Matrix(a);
        Matrix secondMatrix = new Matrix(b);

        System.out.println(firstMatrix.suma(secondMatrix));
        //Matrix.suma(firstMatrix, secondMatrix);
        Matrix.mnozhenieNaChislo(firstMatrix, 3);
        Matrix.mnozhenie(firstMatrix, secondMatrix);

    }
    }
