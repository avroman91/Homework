package com.lesson3;

import java.util.Arrays;
import java.util.Random;

//4*) Задать массив из 10 случайных чисел, и вывеcти минимальный элемент массива.

public class Homework4of5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int sizeOfArray = 10;
        int[] arr = new int[sizeOfArray];
        double minValue = arr[0];
        for (int i1 = 0; i1 < sizeOfArray; i1++) {
            arr[i1] = rand.nextInt(100);
            if (i1 == 0) {
                minValue = arr[0];
            }
            minValue = Math.min(arr[i1], minValue);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Minimum value in array is " + (int) minValue);
    }
}