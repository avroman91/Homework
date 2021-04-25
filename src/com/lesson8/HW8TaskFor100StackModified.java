package com.lesson8;

import java.util.Stack;

public class HW8TaskFor100StackModified {
    public static void main(String[] args) {
        String symbols = "{([])}";
        String check = "())[]{}";
        System.out.println(checkForCorrectSymbols(symbols));
        System.out.println(checkForCorrectSymbols(check));
    }

    public static boolean checkForCorrectSymbols(String string) {
        Stack<Character> stack = new Stack<>();
        String pairs = "(){}[]";

        for (int i = 0; i < string.length(); i++) {
            if (pairs.indexOf(string.charAt(i)) % 2 == 0) {
                stack.push(string.charAt(i));
                continue;
            }
            if (!stack.isEmpty() && pairs.indexOf(stack.peek()) == pairs.indexOf(string.charAt(i)) - 1) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}