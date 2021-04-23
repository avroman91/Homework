package com.lesson6;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework6taskFor100 {

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
                        for (int l = 0; l < triangleArray.size(); l++) {
                            if (Arrays.equals(triangleArray.get(l), tmp)) {
                                break;
                            } else {
                                if (l == triangleArray.size() - 1) {
                                    triangleArray.add(tmp);
                                }
                            }
                        }
                    }
                }
            }
        }
//        for (int[] positionInArray : triangleArray) {
//            System.out.println(Arrays.toString(positionInArray));
//        }
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

    private static boolean checkForCopy(ArrayList<int[]> array, int[] tmp) {
        for (int l = 0; l < array.size(); l++) {
            if (Arrays.equals(array.get(l), tmp)) {
                return true;
            }
        }
        return false;
    }
}