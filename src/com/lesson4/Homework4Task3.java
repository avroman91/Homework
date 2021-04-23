package com.lesson4;

//3) Вывести числа от 1100 до 1200 кратные 17

public class Homework4Task3 {
    public static void main(String[] args) {
        for (int i = 1100; i < 1200; i++) {
            System.out.print(i % 17 == 0 ? i + " " : "");
        }
    }
}