package com.lesson5;

import java.util.ArrayList;
import java.util.List;

public class Homework5TaskFor100NonRecursive {
    public static void main(String[] args) {
        List<String> list = perms("abc");
        list.forEach(s -> System.out.print(s + " "));
    }

    public static List<String> perms(String string) {

        List<String> result = new ArrayList<String>();
        char[] values = string.toCharArray();
        int[] stack = new int[values.length];
        for (int i = 0; i < stack.length; i++) { // start from a specific point without duplicates
            stack[i] = stack.length - i - 1;
        }
        int position = 0;
        while (position < values.length) {

            position = 0;
            StringBuilder sb = new StringBuilder();
            while (position < values.length) { // build the string
                sb.append(values[stack[position]]);
                position++;
            }
            result.add(sb.toString());
            position = 0;
            while (position < values.length) {
                if (stack[position] < values.length - 1) {
                    stack[position]++;
                    if (!containsDuplicate(stack)) { //if false - mean that is not duplicate ;
                        break;
                    } else {
                        position = 0;
                    }
                } else {
                    stack[position] = 0;
                    position++;
                }
            }
        }
        return result;
    }

    private static boolean containsDuplicate(int[] stack) {
        for (int i = 0; i < stack.length; i++) {
            for (int j = 0; j < stack.length; j++) {
                if (stack[i] == stack[j] && i != j) {
                    return true; //there are duplicates;
                }
            }
        }
        return false; //there is no duplicates;
    }
}