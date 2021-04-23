package com.lesson5;

import java.util.Random;

//1) Написать метод который возвращает среднее арифметическое массива который передан как параметр.

public class Homework5Task1 {

    public static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = RANDOM.nextInt(100);
        }
        double result = average(array);
        System.out.println(result);
    }

    private static double average(int[] arrayIn) {
        double sum = 0.0;
        for (int element : arrayIn) {
            sum += element;
        }
        return sum / arrayIn.length;
    }
}