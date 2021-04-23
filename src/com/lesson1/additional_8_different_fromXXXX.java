package com.lesson1;

//8) Вывести на экран числа от 1000 до 9999 такие, что все цифры различны.

public class additional_8_different_fromXXXX {
    public static void main(String[] args) {
        int i;
        int x;
        int y;
        int z;
        int q;

        for (i = 1000; i <= 9999; i++) {
            x = i / 1000;
            y = ((i - (x * 1000)) / 100);
            z = ((i - (x * 1000) - (y * 100)) / 10);
            q = ((i - (x * 1000) - (y * 100)) - (z * 10));
            if (x != y & x != z & x != q & y != z & y != q & z != q)
                System.out.println(i + "\t");
        }

    }
}
