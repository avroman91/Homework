package com.lesson7;

/*
Задание на 100 баллов:
Заданы строка с выражением состоящая из чисел и знаков плюс/минус разделенным пробелом, например "123 + 7 - 52". Вычислить значение выражения.
*/

public class Homework7TaskFor100 {
    public static void main(String[] args) {
        String string = "123 + 7 - 52";
        System.out.println(calculateString(string));
    }

    public static int calculateString(String string) {
        String[] arr = string.split("\\s+");
        int result = 0;
        for (int i = 0; i < arr.length; i += 2) {
            int num = Integer.parseInt(arr[i]);
            if (i == 0) {
                result = num;
                continue;
            }
            if (arr[i - 1].equals("+")) {
                result = result + num;
            } else {
                result = result - num;
            }
        }
        return result;
    }
}