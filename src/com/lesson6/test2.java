package com.lesson6;

import java.util.*;

public class test2 {

    public static void main(String[] args) {
        final int MAX_SIDE = 200;
        final int MAX_SQUARE = 100;
        int count = 0;
        Set<List<Integer>> triangles = new HashSet<>();
        for (int i = 1; i <= MAX_SIDE; i++) {
            for (int j = 1; j <= MAX_SIDE; j++) {
                for (int k = 1; k <= MAX_SIDE; k++) {
                    double square = square(i, j, k);
                    if (square > 0 && square < MAX_SQUARE) {
                        count++;
                        List<Integer> tmp = Arrays.asList(i, j, k);
                        Collections.sort(tmp);
                        triangles.add(tmp);
                    }
                }
            }
        }

        System.out.println("All: " + count);
        System.out.println("Unique: " + triangles.size());
    }

    private static double square(int a, int b, int c) {
        if (a + b > c && a + c > b && c + b > a) {
            double p = (a + b + c) / 2.0;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        } else {
            return 0;
        }
    }


}