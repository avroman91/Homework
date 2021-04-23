package com.lesson5;

import java.util.Random;

/*
4*) Реализовать сортировку массива методами:
a) пузырьком
b) выбором
c) вставками
Описание алгоритмов есть на википедии
#Оставить закомментированы вызовы - ответ Andrey Kadatsky в telegram;
All methods are int[], so they return sorted array. If it is not necessary - all those methods cound be changed for void.
All time measurement of the methods may vary depending on the computer.
*/

public class Homework5Task4 {

    public static final int COUNT = 100;

    public static void main(String[] args) {
        int[] randomArray = new int[COUNT];
        Random random = new Random();
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(100);
        }
//        bubble(randomArray);    //call "bubble" method;    for randomArray.length=100_000 it will take 8.926 sec
//        choose(randomArray);    //call "selection" method; for randomArray.length=100_000 it will take 3.544 sec
//        insertion(randomArray); //call "insertion" method; for randomArray.length=100_000 it will take 1.046 sec
    }

    public static int[] bubble(int[] array) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        time = System.currentTimeMillis() - time;
        System.out.println("Time: " + time / 1000.0);
        return array;
    }

    public static int[] choose(int[] array) {
        long time = System.currentTimeMillis();
        for (int i = 0; i < array.length; i++) {
            int minValue = array[i];
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < minValue) {
                    minValue = array[j];
                    minIndex = j;
                }
            }
            int tmp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = tmp;

        }
        time = System.currentTimeMillis() - time;
        System.out.println("Time: " + time / 1000.0);
        return array;
    }

    public static int[] insertion(int[] array) {
        long time = System.currentTimeMillis();
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = i;
            while (j > 0 && array[j - 1] > tmp) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = tmp;
        }
        time = System.currentTimeMillis() - time;
        System.out.println("Time: " + time / 1000.0);
        return array;
    }
}
