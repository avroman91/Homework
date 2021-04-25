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
        String open = "({[";
        String pairs = "(){}[]";

        char[] array = string.toCharArray();

        for (int i = 0; i < string.length(); i++) {
            if (open.contains(array[i] + "")) {
                stack.push(array[i]);
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