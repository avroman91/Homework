package com.lesson10;

import java.util.Arrays;

/*2*) Реализовать метод который сортирует массив целых чисел быстрой сортировкой

https://en.wikipedia.org/wiki/Quicksort*/

public class HW10QuickSort {
    public static void main(String[] args) {
        int[] array = {74, 53, 24, 40, 86, 72, 76, 78, 37, 66, 84, 31, 93, 14, 8, 43, 26, 54, 33, 67};
        quickSort(array, 0 , array.length-1);
        System.out.println(Arrays.toString(array));
    }

    public static void quickSort(int[] array, int from, int to) {
        if (from < to) {
            int div = divideIndex(array, from, to);
            quickSort(array, from, div -1);
            quickSort(array, div, to);

        }
    }

    public static int divideIndex (int[] arr, int from, int to) {
        int leftIndex = from;
        int rightIndex = to;

        int pivot = arr[from];

        while (leftIndex <= rightIndex) {
            while (arr[leftIndex] < pivot) {
                leftIndex++;
            }
            while (arr[rightIndex] > pivot) {
                rightIndex--;
            }
            if (leftIndex <= rightIndex) {
                swap(arr, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    public static void swap(int[] array, int indexLeft, int indexRight) {
        int tmp = array[indexLeft];
        array[indexLeft] = array[indexRight];
        array[indexRight] = tmp;
    }

}
