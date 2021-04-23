package com.lesson4;

/*Написать программу которая вычисляет значения корня квадратного без использования библиотечных методов типа Math.sqrt().
Например методом половинного деления.*/

public class Homework4TaskFor100 {
    public static void main(String[] args) {
        int x = 122;  // input value , from which square root will be calculated.
        double accuracy = 0.0001;
        double testSquareRoot = x / 2d;
        for (double i = x; i > accuracy; i -= testSquareRoot) {
            testSquareRoot = 0.5 * (testSquareRoot + x / testSquareRoot);
        }
        if (x > 1) {
            System.out.printf("The square root of %s will be equal %.2f", x, testSquareRoot);
        } else if (x == 1) {
            System.out.println("The square root of 1 will be equal 1");
        } else {
            System.out.println("Error, square root from zero or negative value cannot be calculated.");
        }
    }
}