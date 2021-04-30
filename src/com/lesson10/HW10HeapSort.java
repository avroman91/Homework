package com.lesson10;

import java.util.Arrays;

public class HW10HeapSort {

    public static void main(String[] args) {
        int[] array = {74, 53, 24, 40, 86, 72, 76, 78, 37, 66, 84, 31, 93, 14, 8, 43, 26, 54, 33, 67};
        int n = array.length;
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }


    private static void heapSort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
        for (int i = n - 1; i >= 0; i--) {
            int tmp = arr[0];
            arr[0] = arr[i];
            arr[i] = tmp;
            heapify(arr, i, 0);
        }
    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }
}