package com.lesson8;

import java.util.Stack;

public class HW8TaskFor100Stack {
    public static void main(String[] args) {
        String symbols = "{([])}";
        String check = "())[]{}";
        System.out.println(checkForCorrectSymbols(symbols));
        System.out.println(checkForCorrectSymbols(check));

    }

    public static boolean checkForCorrectSymbols(String string) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '{' || string.charAt(i) == '[' || string.charAt(i) == '(') {
                stack.push(string.charAt(i));
                continue;
            }
            if (stack.isEmpty()) {
                return false;
            }
            if (string.charAt(i) == '}') {
                if (stack.peek() == '{') {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (string.charAt(i) == ']') {
                if (stack.peek() == '[') {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (string.charAt(i) == ')') {
                if (stack.peek() == '(') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}