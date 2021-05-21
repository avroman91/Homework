package com.lesson13;

public class TestLongMath {
    public static void main(String[] args) {
        String sum = LongMath.sum("195", "15"); // 580
        String sub = LongMath.subtraction("124", "456"); //-332
        String div = LongMath.division("1524", "456"); //3
        String mult = LongMath.mult("135454", "5"); //3
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(div);
        System.out.println(mult);
    }
}
