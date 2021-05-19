package com.lesson13;

public class TestLongMath {
    public static void main(String[] args) {
        String s = LongMath.sum("124","456");
        String d = LongMath.dev("124","456"); //-332
        System.out.println(d);
    }
}
