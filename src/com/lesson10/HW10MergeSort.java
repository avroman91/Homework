package com.lesson10;

import java.util.Arrays;

public class HW10MergeSort {
    public static void main(String[] args) {
        int[] array = {74, 53, 24, 40, 86, 72, 76, 78, 37, 66, 84, 31, 93, 14, 8, 43, 26, 54, 33, 67};
        System.out.println(Arrays.toString(mergeSort(array)));
    }

    private static int[] mergeSort(int[] array) {
        int[] tmp;
        int[] startingArray = array;
        int[] resultingArray = new int[array.length];

        int size = 1;
        while (size < array.length) {
            for (int i = 0; i < array.length; i += 2 * size) {
                merge(startingArray, i, startingArray, i + size, resultingArray, i, size);
            }
            tmp = startingArray;
            startingArray = resultingArray;
            resultingArray = tmp;
            size = size * 2;

        }
        return startingArray;
    }

    private static void merge(int[] first, int firstStart, int[] second, int secondStart, int[] finalArray, int finalStart, int size) {

        int firstEnd = Math.min(firstStart + size, first.length);
        int secondEnd = Math.min(secondStart + size, second.length);

        int iterationCounter = firstEnd - firstStart + secondEnd - secondStart;

        for (int i = finalStart; i < finalStart + iterationCounter; i++) {

            if (firstStart < firstEnd && (secondStart >= secondEnd || first[firstStart] < second[secondStart])) {
                finalArray[i] = first[firstStart];
                firstStart++;
            } else {
                finalArray[i] = second[secondStart];
                secondStart++;
            }

        }
    }
}
