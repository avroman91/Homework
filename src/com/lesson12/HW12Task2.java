package com.lesson12;

/*2*) Задана строка из английских слов через пробел. Написать метод который возвращает те же слова в обратном порядке.
ПРи этом слова изменены иак что в каждом слове первая буква большая а остальные маленькие.*/

import java.util.Locale;

public class HW12Task2 {

    private static String test = "will mike dustin eleven lucas max";

    public static void main(String[] args) {
        System.out.println(reverseAndUpperCaseAtFirstChar(test));
    }

    private static String reverseAndUpperCaseAtFirstChar (String input) {
        String[] split = input.split("\\s+");
        StringBuilder reformatedStringBuiler = new StringBuilder();
        for (int i = split.length-1; i >= 0; i--) {
            String temp = split[i].toLowerCase(Locale.ROOT);
            temp = temp.replaceFirst(String.valueOf(temp.charAt(0)), String.valueOf(Character.toUpperCase(temp.charAt(0))));
            reformatedStringBuiler.append(temp).append(" ");
        }
        return reformatedStringBuiler.toString();
    }
}
