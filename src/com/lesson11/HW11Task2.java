package com.lesson11;

import java.util.Arrays;

public class HW11Task2 {

    private static int[][] matrix = {{14, 15, 16, 17}, {10, 11, 12, 13}, {22, 23, 24, 25}, {18, 19, 20, 21}};

    public static void main(String[] args) {
        MatrixOperations matrixOperations = new MatrixOperations();
        matrixOperations.swapRows(matrix, 0, 1);
        matrixOperations.swapRows(matrix, 2, 3);
        matrixOperations.swapColumn(matrix, 0, 1);
        matrixOperations.mul(matrix, 2);
        matrixOperations.print(matrix);
        int[] array = matrixOperations.toArray(matrix);
        System.out.println(Arrays.toString(array));
        System.out.println(matrixOperations.max(matrix));
    }
}