package com.lesson4;

import java.util.Scanner;

/*1) Попросить пользователя ввести 2 числа.
Используя тернарный оператор вывести меньшее из них.*/

public class Homework4Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first value: ");
        int firstValue = scanner.nextInt();
        System.out.println("Please enter second value: ");
        int secondValue = scanner.nextInt();
        System.out.printf("Minimal value from yours input is : %s", firstValue < secondValue ? firstValue : secondValue);
    }
}