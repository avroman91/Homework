package com.lesson6;

import java.util.ArrayList;
import java.util.Arrays;

public class test {

    public static final int SETSQUARE = 100;

    public static void main(String[] args) {
        ArrayList<int[]> triangleArray = new ArrayList<int[]>();

        for (int i = 1; i <= SETSQUARE * 2; i++) {
            for (int j = 1; j <= SETSQUARE * 2; j++) {
                for (int k = 1; k <= SETSQUARE * 2; k++) {
                    double s = triangleSquare(i, j, k);
                    if (s == 0) {
                        continue;
                    }
                    if (s < SETSQUARE) {
                        int[] tmp = {i, j, k};
                        Arrays.sort(tmp);
                        if (triangleArray.isEmpty()) {
                            triangleArray.add(tmp);
                        }
                        addToListIfTHereIsNoCopy(triangleArray, tmp);

                    }
                }
            }
        }
        System.out.println(triangleArray.size());
    }

    private static double triangleSquare(int sideA, int sideB, int sideC) {
        double result = 0;
        if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA) {
            double halfP = (sideA + sideB + sideC) / 2.0;
            result = Math.sqrt(halfP * (halfP - sideA) * (halfP - sideB) * (halfP - sideC));
        }
        return result;
    }

    private static void addToListIfTHereIsNoCopy(ArrayList<int[]> triangleArray, int[] tmp) {
        Arrays.sort(tmp);
        for (int[] arr : triangleArray) {
            if (Arrays.equals(arr, tmp)) {
                return;
            }

        }
        triangleArray.add(tmp);
    }
}