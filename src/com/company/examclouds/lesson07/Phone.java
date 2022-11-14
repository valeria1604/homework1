package com.company.examclouds.lesson07;

public class Phone {
    private int number;
    private int weight;
    private String model;

    public Phone(int number, int weight, String model) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public static void receiveCall(String name) {
        System.out.println("Звонит: " + name);
    }

    public static void receiveCall(String name, int number) {
        System.out.println("Звонит: " + name + " номер телефона: "+ number);
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", weight=" + weight +
                ", model=" + model +
                '}';
    }
}
