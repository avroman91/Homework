package com.lesson1;

//6) Дано трехзначное число. Переставьте первую и последнюю цифры.

public class additional_6_rotation1to3 {
    public static void main(String[] args) {
        int i = 385;
        int x;
        int y;
        int z;

        x = i / 100;
        y = ((i - (x * 100)) / 10);
        z = (i - (x * 100) - (y * 10));
        System.out.println(z + "" + y + "" + x);
    }
}
