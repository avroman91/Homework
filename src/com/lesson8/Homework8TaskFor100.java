package com.lesson8;

import java.util.ArrayList;

/*
Баланс скобок. Дана конечная последовательность, состоящая из левых и правых скобок различных заданных типов.
Определить, можно ли добавить в нее цифры и знаки арифметических действий так, чтобы получилось правильное арифметическое выражение.
*/

public class Homework8TaskFor100 {
    public static void main(String[] args) {
        String symbols = "{([])}";
        String check = "())[]{}";
        System.out.println(checkForCorrectSymbols(symbols));
        System.out.println(checkForCorrectSymbols(check));
    }

    public static boolean checkForCorrectSymbols(String string) {
        ArrayList<Character> array = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '{' || string.charAt(i) == '[' || string.charAt(i) == '(') {
                array.add(string.charAt(i));
                continue;
            }
            if (array.isEmpty()) {
                return false;
            }
            if (string.charAt(i) == '}') {
                if (array.get(array.size() - 1) == '{') {
                    array.remove(array.size() - 1);
                } else {
                    return false;
                }
            } else if (string.charAt(i) == ']') {
                if (array.get(array.size() - 1) == '[') {
                    array.remove(array.size() - 1);
                } else {
                    return false;
                }
            } else if (string.charAt(i) == ')') {
                if (array.get(array.size() - 1) == '(') {
                    array.remove(array.size() - 1);
                } else {
                    return false;
                }
            }
        }
        return array.isEmpty();
    }
}