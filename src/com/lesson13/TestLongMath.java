package com.lesson13;

public class TestLongMath {
    public static void main(String[] args) {
        String s = LongMath.sum("124","456"); // 580
        String d1 = LongMath.dev("124","456"); //-332
        String d2 = LongMath.dev("524","456"); // 068
        System.out.println(s);
        System.out.println(d1);
        System.out.println(d2);
    }
}
