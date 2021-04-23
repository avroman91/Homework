package com.lesson1;

//5) Даны три числа. Написать "yes", если среди них есть одинаковые.


public class additional_5_same_var {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        a = 58;
        b = 85;
        c = 58;
        if (a == b | b == c | c == a) System.out.println("Yes");
    }
}
