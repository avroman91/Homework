package com.lesson5;

import java.util.Arrays;

/*3*) Есть массив заполненный случайными числами. Создать массив в 2 раза больше исходного и продублировать в нем исходный 2 раза,
но второй раз в обратном порядке, например [1,2,3] => [1,2,3,3,2,1]*/

public class Homework5Task3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9}; //Change for your array
        int[] result = new int[array.length * 2]; // Resulting array
        System.arraycopy(array, 0, result, 0, array.length);
        for (int i = 0; i < array.length; i++) {
            result[array.length + i] = array[array.length - 1 - i];
        }
        System.out.println(Arrays.toString(result));
    }
}
