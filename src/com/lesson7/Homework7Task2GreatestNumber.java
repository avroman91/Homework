package com.lesson7;

public class Homework7Task2GreatestNumber {
    public static void main(String[] args) {
        System.out.println(greatestNumberInString("1", "2", "3", "4", "555"));
    }

    public static int greatestNumberInString(String... strings) {
        int result = 0;
        for (String string : strings) {
            if (Integer.parseInt(string) > result) {
                result = Integer.parseInt(string);
            }
        }
        return result;
    }
}