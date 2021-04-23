package com.lesson2;

/*7) Попросить пользователя ввести 3 числа.

Используя if-else вывести минимальное и максимальное из этих чисел.*/

import java.util.Scanner;

public class Homework_2_7 {
    public static void main(String[] args) {
        int maxValue = 0;
        int minValue = 0;

        System.out.println("Enter first value:");
        Scanner scan = new Scanner(System.in);
        int first = scan.nextInt();
        System.out.println("Enter second value:");
        int second = scan.nextInt();
        System.out.println("Enter third value:");
        int third = scan.nextInt();
        if (first > second) {
            if (first > third)
                maxValue = first;
            if (second < third)
                minValue = second;
        }
        if (second > first) {
            if (second > third)
                maxValue = second;
            if (first < third)
                minValue = first;
        }
        if (third > second) {
            if (third > first)
                maxValue = third;
        } else minValue = third;
        if (maxValue == 0 & first != 0 & second != 0 & third != 0) System.out.println("All values are the same");
        else System.out.printf("Maximum value is : %s ; Minimum value is : %s", maxValue, minValue);

    }
}
