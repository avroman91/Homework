package com.codewars;

public class Maskify {
    public static void main(String[] args) {
        System.out.println(maskify("ololololololololo!!"));
    }

    public static String maskify(String str) {
        String result = "";
        for (int i = 0; i < str.length() - 4; i++) {
            result = result + str.charAt(i);
        }
        return str.replace(result, "#");
    }
}
