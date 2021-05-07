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

    private static int[][] matrix = {{14, 15, 16, 17}, {10, 11, 12, 13}, {22, 23, 24, 25}, {18, 19, 20, 21}};

    public static void main(String[] args) {
        MatrixOperations matrixOperations = new MatrixOperations();
//        sortMatrix(matrix);
//        matrixOperations.print(matrix);
        int[][] mat = new int[5][4]; // [5][6] - не работает
        fillMatrixInSpiral(mat);
        matrixOperations.print(mat);

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
        int insertValue = 1;
        int initialPositionI = array.length %2 == 0 ? array.length / 2 -1 : array.length/2 ;
        int initialPositionJ = array[0].length %2 == 0 ? array[0].length / 2 -1 : array[0].length/2;
        int vertical = 1;
        int horizontal = 1;
        int goUpOrDown = 2; // %2 = 0 --> true - down & right, false - up and left
        int steps = 1;
        int maxValue = array.length * array[0].length + 1;
        array[initialPositionI][initialPositionJ] = insertValue;
        insertValue++;
        while (insertValue < maxValue) {
            if (goUpOrDown % 2 == 0) {
                while (vertical > 0 && insertValue < maxValue && initialPositionI < array.length - 1) {
                    array[++initialPositionI][initialPositionJ] = insertValue;
                    vertical--;
                    insertValue++;
                }
                while (horizontal > 0 && insertValue < maxValue && initialPositionJ < array[0].length - 1) {
                    array[initialPositionI][++initialPositionJ] = insertValue;
                    horizontal--;
                    insertValue++;
                }
                goUpOrDown++;
            } else {
                while (vertical > 0 && insertValue < maxValue && initialPositionI > 0) {
                    array[--initialPositionI][initialPositionJ] = insertValue;
                    vertical--;
                    insertValue++;
                }
                while (horizontal > 0 && insertValue < maxValue && initialPositionJ > 0) {
                    array[initialPositionI][--initialPositionJ] = insertValue;
                    horizontal--;
                    insertValue++;
                }
                goUpOrDown++;
            }
            steps++;
            vertical = steps;
            horizontal = steps;
        }
    }
}
