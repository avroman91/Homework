package com.lesson4;

//6*) Задан массив случайных чисел. Вывести индекс минимального элемента, первого если их несколько.

public class Homework4Task6 {
    public static void main(String[] args) {
        int[] array = {4, 5, 7, 8, 1, 3, 1, 6, 1, 9, 8, 7, 5, 2, 3, 6, 1};
        int minValue = array[0];
        int ordinalNo = 0;
        for (int i = 0; i < array.length; i++) {
            minValue = Math.min(minValue, array[i]);
            if (minValue == array[i] && array[ordinalNo] != array[i]) {
                ordinalNo = i;
            }
        }
        System.out.println("First minimal value in your array located at index " + ordinalNo);
    }
}