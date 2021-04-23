package com.lesson7;

/*Использя оператор "..." написать метод который возвращает максимальное значение из переданных
Пример: https://stackoverflow.com/a/3158751/1159507*/

public class Homework7Task2 {
    public static void main(String[] args) {
        System.out.println(longestPartOfTheString("one", "two", "three", "four", "ThisIsSparta!!"));
    }

    public static String longestPartOfTheString(String... strings) {
        String result = "";
        for (String string : strings) {
            if (string.length() > result.length()) {
                result = string;
            }
        }
        return result;
    }
}