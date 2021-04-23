package com.lesson7;

/*
Задание на 100 баллов:
Заданы строка с выражением состоящая из чисел и знаков плюс/минус разделенным пробелом, например "123 + 7 - 52". Вычислить значение выражения.

*/

public class Homework7TaskFor100AddedMultAndDiv {
    public static void main(String[] args) {
        String string = "123 + 7 * 52 + 87 / 5 * 20 + 8 / 8 * 1";
        System.out.println(calculateString(string));
    }

    public static double calculateString(String string) {
        String[] arr = string.split("\\s+");
        double result = 0;
        for (int i = 0; i < arr.length; i += 2) {
            double num = Integer.parseInt(arr[i]);
            if (i == 0) {
                result = num;
                continue;
            }
            num = checkForMultAndDiv(Integer.parseInt(arr[i]), i, arr);
            if (arr[i - 1].equals("+")) {
                result = result + num;
            } else if (arr[i - 1].equals("-")) {
                result = result - num;
            }
        }
        return result;
    }

    public static double checkForMultAndDiv(double inputValue, int i, String[] arr) {
        if (i < arr.length - 1) {
            if (arr[i + 1].equals("*")) {
                return checkForMultAndDiv(inputValue * Integer.parseInt(arr[i + 2]), i + 2, arr);
            }
            if (arr[i + 1].equals("/")) {
                return checkForMultAndDiv(inputValue / Integer.parseInt(arr[i + 2]), i + 2, arr);
            }
        }
        return inputValue;
    }
}