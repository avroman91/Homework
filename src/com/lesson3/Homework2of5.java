package com.lesson3;

import java.util.Random;
import java.util.Scanner;

//Пользователь вводит 2 числа a,b. Вывести целое случайное число в диапазоне a..b включительно

public class Homework2of5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter fist value, from which the range starts");
        int firstValue = scan.nextInt();
        System.out.println("Enter sedond value, at which the range ends: ");
        int secondValue = scan.nextInt();
        Random random = new Random();
        System.out.printf("Random value at your range is %s", random.nextInt(secondValue - firstValue + 1) + firstValue);
    }
}
