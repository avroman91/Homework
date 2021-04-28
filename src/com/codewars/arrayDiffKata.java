package com.codewars;

/*
* Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.

It should remove all values from list a, which are present in list b keeping their order.

array_diff({1, 2}, 2, {1}, 1, *z) == {2} (z == 1)
If a value is present in b, all of its occurrences must be removed from the other:

array_diff({1, 2, 2, 2, 3}, 5, {2}, 1, *z) == {1, 3} (z == 2)
* */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*    public void sampleTests() {
      assertArrayEquals(new int[] {2}, Kata.arrayDiff(new int [] {1,2}, new int[] {1}));
      assertArrayEquals(new int[] {2,2}, Kata.arrayDiff(new int [] {1,2,2}, new int[] {1}));
      assertArrayEquals(new int[] {1}, Kata.arrayDiff(new int [] {1,2,2}, new int[] {2}));
      assertArrayEquals(new int[] {1,2,2}, Kata.arrayDiff(new int [] {1,2,2}, new int[] {}));
      assertArrayEquals(new int[] {}, Kata.arrayDiff(new int [] {}, new int[] {1,2}));
    }
    */
public class arrayDiffKata {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDiff(new int[]{}, new int[]{1, 2})));
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2}, new int[]{1})));
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2, 2}, new int[]{1})));
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2, 2}, new int[]{2})));
        System.out.println(Arrays.toString(arrayDiff(new int[]{1, 2, 2}, new int[]{})));
        System.out.println(Arrays.toString(arrayDiff(new int[]{}, new int[]{1, 2})));
    }


    public static int[] arrayDiff(int[] a, int[] b) {
        StringBuilder result = new StringBuilder();
        if (b.length == 0){
            return a;
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    break;
                } else if (j == b.length - 1) {
                    result.append(a[i] + " ");
                }
            }
        }
        if (result.length() == 0) {
            return new int[]{};
        }
        String res = result.toString();
        String[] tmp = res.split("\\s+");
        int size = tmp.length;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(tmp[i]);
        }
        a = arr;
        return a;
    }

    public static int[] arrayDiffBestPractices(int[] a, int[] b) {
        List<Integer> list = new ArrayList<>();
        loop:
        for (int num : a) {
            for (int i : b) if (num == i) continue loop;
            list.add(num);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
