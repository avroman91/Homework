package com;

import java.util.*;

public class BasicFunctions {

    public static final Random RANDOM = new Random();

    public static int sumAllDigitsInInt(int value) {
        return value < 10 ? value : (value % 10 + sumAllDigitsInInt(value / 10));
    }

    public static int[] createRandomArray(int arrayLength, int bound) {
        int[] array = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            array[i] = RANDOM.nextInt(bound);
        }
        return array;
    }

    public static int[] reverseArray(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
        return array;
    }

    public static int[] arrayStringToArrayInt (String[] array){
        int size = array.length;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(array[i]);
        }
        return arr;
    }

    private static List<Integer> removeDuplicates(List<Integer> list) {
        Set<Integer> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }


}
