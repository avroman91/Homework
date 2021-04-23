package com.lesson5;

import java.util.Arrays;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        String str = "abcd";
        char[] arr = str.toCharArray();
        int count = fuctorial(arr.length);
        int max = arr.length - 1;
        int shift = max;
        char t;
        while (count > 0) {
            t = arr[shift];
            arr[shift] = arr[shift - 1];
            arr[shift - 1] = t;
            print(arr);
            count--;
            if (shift < 2) {
                shift = max;
            } else {
                shift--;
            }
        }
    }

    static void print(char[] arr) {
        System.out.print(Arrays.toString(arr) + " ");
    }

    static int fuctorial(int n) {
        return (n > 0) ? n * fuctorial(n - 1) : 1;
    }
}