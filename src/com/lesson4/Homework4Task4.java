package com.lesson4;

import java.util.Arrays;

//4) Заполнить массив из 100 элементов по убыванию: первый элемент = 100, второй 99, итд, т.е. при выводе он должен выглядеть: [100, 99, 98, ...]

public class Homework4Task4 {
    public static void main(String[] args) {
        int sizeOfArray = 100;
        int[] array = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = sizeOfArray - i;
        }
        System.out.println(Arrays.toString(array));
    }
}
