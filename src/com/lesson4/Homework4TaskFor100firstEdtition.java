package com.lesson4;

/*Написать программу которая вычисляет значения корня квадратного без использования библиотечных методов типа Math.sqrt().
Например методом половинного деления.*/

public class Homework4TaskFor100firstEdtition {
    public static void main(String[] args) {
        int x = 3;  // input value , from which square root will be calculated.
        double accuracy = 0.0001;
        double testSquareRoot = x / 2;
        double previousTest = Double.POSITIVE_INFINITY;
        while (previousTest - testSquareRoot > accuracy) {
            previousTest = testSquareRoot;
            testSquareRoot = 0.5 * (testSquareRoot + x / testSquareRoot);
        }
        if (x > 0) {
            System.out.printf("The square root of %s will be equal %.2f", x, testSquareRoot);
        } else {
            System.out.println("Error, square root from zero or negative value cannot be calculated.");
        }
    }
}