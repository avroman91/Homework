package com.lesson1;

//7) Дано четырехзначное число. Определите, есть ли одинаковые цифры в нем.

public class additional_7_sameFromXXXX {
    public static void main(String[] args) {
        int i = 7853;
        int x, y, z, q;
        x = i / 1000;
        y = ((i - (x * 1000)) / 100);
        z = ((i - (x * 1000) - (y * 100)) / 10);
        q = ((i - (x * 1000) - (y * 100)) - (z * 10));
        if (x == y | x == z | x == q | y == z | y == q | z == q) System.out.println("Yes");
    }
}
