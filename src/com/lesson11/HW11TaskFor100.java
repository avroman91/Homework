package com.lesson11;

import java.util.Arrays;

/*
задание на 100 баллов:
написать методы для работы с матрицами:
- отсортировать матрицу так чтобы в верхнем левом углу был наименьший элемент, а в нижнем правом наибощий
- заполнить матрицу числами по возрастанию начиная с 1 по спирали:
https://math.all-tests.ru/sites/math.all-tests.ru/files/images/318-problem.png
- вычислить определитель матрицы
*/

public class HW11TaskFor100 {

    private static int[][] matrix = {{24, 15, 15}, {19, 19, 20}, {22, 23, 35}};

    public static void main(String[] args) {
        MatrixOperations matrixOperations = new MatrixOperations();

//        sortMatrix(matrix);
//        matrixOperations.print(matrix);
//
//        int[][] mat = new int[5][5];
//        fillMatrixInSpiral(mat);
//        matrixOperations.print(mat);
//
//        System.out.println(det(matrix));  // only for martix 3x3 (Sarrus rule)
    }

    public static void sortMatrix(int[][] matrix) {
        MatrixOperations matrixOperations = new MatrixOperations();
        int[] array = matrixOperations.toArray(matrix);
        Arrays.sort(array);
        int index = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = array[index];
                index++;
            }
        }
    }

    public static void fillMatrixInSpiral(int[][] array) {
        int initialValue = 1;
        int row = array.length % 2 == 0 ? array.length / 2 - 1 : array.length / 2;
        int column = array[0].length % 2 == 0 ? array[0].length / 2 - 1 : array[0].length / 2;
        int vertical = 1;
        int horizontal = 1;
        int goUpOrDown = 0; // %2 = 0 --> true - down & right, false - up and left
        int steps = 1;
        int maxValue = array.length * array[0].length + 1;
        array[row][column] = initialValue;
        initialValue++;
        while (initialValue < maxValue) {
            if (goUpOrDown % 2 == 0) {
                while (vertical > 0 && initialValue < maxValue && row < array.length - 1) {
                    array[++row][column] = initialValue;
                    vertical--;
                    initialValue++;
                }
                while (horizontal > 0 && initialValue < maxValue && column < array[0].length - 1) {
                    array[row][++column] = initialValue;
                    horizontal--;
                    initialValue++;
                }
                goUpOrDown++;
            } else {
                while (vertical > 0 && initialValue < maxValue && row > 0) {
                    array[--row][column] = initialValue;
                    vertical--;
                    initialValue++;
                }
                while (horizontal > 0 && initialValue < maxValue && column > 0) {
                    array[row][--column] = initialValue;
                    horizontal--;
                    initialValue++;
                }
                goUpOrDown++;
            }
            steps++;
            vertical = steps;
            horizontal = steps;
        }
    }

    public static int det(int[][] matrix) { //only for martix 3x3 (Sarrus rule)
        int tmp = 0;
        while (true) {
            matrix[tmp] = Arrays.copyOf(matrix[tmp], matrix[tmp].length + matrix[tmp].length - 1);
            tmp++;
            if (tmp == matrix.length) {
                break;
            }
        }
        for (int j = 0; j < matrix.length; j++) {
            if (matrix[j].length - matrix.length >= 0)
                System.arraycopy(matrix[j], 0, matrix[j], matrix.length, matrix[j].length - matrix.length);

        }
        int resultForPositive = 0;
        int resultForNegative = 0;
        for (int j = 0; j <= matrix.length - 1; j++) { //left-->right
            tmp = matrix[0][j];
            for (int k = 1; k < matrix.length; k++) {
                tmp = tmp * matrix[k][j + k];
            }
            resultForPositive += tmp;
        }
        for (int j = matrix.length - 1; j <= matrix[0].length - 1; j++) { //right-->left
            tmp = matrix[0][j];
            for (int k = 1; k < matrix.length; k++) {
                tmp = tmp * matrix[k][j - k];
            }
            resultForNegative += tmp;
        }
        return resultForPositive - resultForNegative;
    }
}