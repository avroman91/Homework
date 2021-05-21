package com.lesson13;

public class TestLongMath {
    public static void main(String[] args) {
        String s = LongMath.sum("124", "456"); // 580
        String d1 = LongMath.subtraction("124", "456"); //-332
        String d2 = LongMath.subtraction("524", "456"); // 68
        String d3 = LongMath.subtraction("1524", "456"); // 1068
        String d4 = LongMath.division("1524", "456"); //3
        System.out.println(s);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
    }
}
