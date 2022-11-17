package com.company.examclouds.lesson072ver.task01;

import com.company.examclouds.lesson072ver.task2.Matrix;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person firstPerson = new Person();
        Person secondPerson = new Person("Aleksandr", 32);
        Person.talk(secondPerson.fullName, secondPerson.age);

        Matrix firstMatrix = new Matrix(2,-3, 1, 5, 4, -2, 2,3);
        Matrix secondMatrix = new Matrix(4,2, -5, -4, 1, 3, 2,3);
        System.out.println(Arrays.deepToString(firstMatrix.getNumbers()));
        System.out.println(Arrays.deepToString(secondMatrix.getNumbers()));
        Matrix.suma(firstMatrix, secondMatrix);
        Matrix.mnozhenieNaChislo(firstMatrix, 2);

        Matrix thirdMatrix = new Matrix(1,2, 3, 1, 2,2);
        Matrix fourthMatrix = new Matrix(-1,3, 1, 1, 2,2);
        Matrix.mnozhenie(thirdMatrix, fourthMatrix);

    }
}
