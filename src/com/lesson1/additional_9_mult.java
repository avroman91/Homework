package com.lesson1;

//Выведите на экран таблицу умножения для чисел от 1 до 10.

public class additional_9_mult {
    public static void main(String[] args) {
        System.out.println("Таблица умножения");
        int x;
        int y;
        int z;
        for (y = 1; y <= 10; y++) {
            for (x = 1; x <= 10; x++)
                System.out.print((x * y) + "\t");
            System.out.println();
        }

    }
}
