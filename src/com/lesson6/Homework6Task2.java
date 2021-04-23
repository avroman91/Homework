package com.lesson6;

import java.util.Arrays;

/*
2) В метод передается массив и 2 числа a,b;
Напечатать числа с индексами от a,b или напечатать что индексы недопустимы.
Пример: {5,3,2,6,7}, a=1, b=3, результат: [3,2,6]
*/
public class Homework6Task2 {
    public static void main(String[] args) {
        int[] array = {5, 3, 2, 6, 7};
        method(array, 1, 3);
    }

    public static void method(int[] array, int start, int end) {
        if (start > end || start < 0 || end > array.length - 1) {
            System.out.println("Wrong index!");
        } else {
            int[] resultingArray = new int[end - start + 1];
            System.arraycopy(array, start, resultingArray, 0, end - start + 1);
            System.out.println(Arrays.toString(resultingArray));
        }
    }
}
