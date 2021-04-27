package com.codewars;

public class DisemvowelTask {
    public static void main(String[] args) {

        System.out.println(disemvowel("What are you, a communist?"));

    }

    public static String disemvowel(String str) {
        return str.replaceAll("(?i)[aeiou]", "");
    }
}
