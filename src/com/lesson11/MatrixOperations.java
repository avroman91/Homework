package com.lesson11;

/*
print(int[] arr) - печатает матрицу
swapColumns(int arr[], i, j) - меняет 2 столбца местами
swapRows(int arr[], i, j) - меняет 2 рядка местами
mul(int[] arr, int value) - умножает матрицу на число
toArray(int[] arr) - превращает матрицу в массив. Например если была матрица на 3x4 то вернуть массив из 12 элемнтов
max(int[] arr) - возвращает максимальный элемент матрицы
*/

import java.util.Arrays;

public class MatrixOperations {


    public void print(int[][] matrix) {
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }

    public void swapRows(int[][] matrix, int i, int j) {
        int[] tmp = matrix[i];
        matrix[i] = matrix[j];
        matrix[j] = tmp;
    }

    public void swapColumn(int[][] matrix, int i, int j) {
        for (int k = 0; k < matrix[0].length; k++) {
            int tmp = matrix[k][i];
            matrix[k][i] = matrix[k][j];
            matrix[k][j] = tmp;
        }
    }

    public void mul(int[][] matrix, int mul) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = matrix[i][j] * mul;
            }
        }
    }

    public int[] toArray(int[][] matrix) {
        int[] array = new int[matrix.length * matrix[0].length];
        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                array[index] = matrix[i][j];
                index++;
            }
        }
        return array;
    }

    public int max(int[][] matrix) {
        int maxValue = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (maxValue < matrix[i][j]) {
                    maxValue = matrix[i][j];
                }
            }
        }
        return maxValue;
    }
}
