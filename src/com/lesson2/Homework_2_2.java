package com.lesson2;

import java.util.Scanner;

/*2) Попросить пользователя ввести его вес.

На луне вес будет в 6 раз меньше. Вывести вес этого человека на луне.*/

public class Homework_2_2 {
    public static void main(String[] args) {
        System.out.println("Please enter your weight: ");
        Scanner weightInput = new Scanner(System.in);
        float weight = weightInput.nextInt();
        float moonWeight = weight / 6;
        System.out.printf("Your weight on the moon will be: %.2f", moonWeight);
    }
}
