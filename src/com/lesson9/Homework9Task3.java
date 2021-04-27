package com.lesson9;

/*3*) Написать метод который ищет при помощи бинарного поиска есть ли число в отсортированном массиве. Входящие параметры: массив и число.

(считаем что массива который нам передали отсортирован, проверять это не нужно)*/

public class Homework9Task3 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < 100; i++) {
            array[i] = i;
        }
        System.out.println(isThisNumberInTheArray(array, 16));
    }

    public static boolean isThisNumberInTheArray(int[] array, int value) {
        int first = 0;
        int last = array.length - 1;
        int mid = (first + last) / 2;
        while (first <= last) {
            if (array[mid] < value) {
                first = mid + 1;
            } else if (array[mid] == value) {
                return true;
            } else {
                last = mid - 1;
            }
            mid = (last + first) / 2;
        }
        return false;
    }
}
