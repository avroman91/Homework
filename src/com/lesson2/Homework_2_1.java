package com.lesson2;

import java.util.Scanner;

/*1) Попросить пользователя ввести год рождения.

Вывести его возраст.
*/

public class Homework_2_1 {
    public static void main(String[] args) {
        System.out.println("Please enger your year of birth:");
        Scanner year = new Scanner(System.in);
        int yearOfBirth = year.nextInt();
        int age = 2021 - yearOfBirth;
        System.out.println("This year your age will be " + age);
    }
}
