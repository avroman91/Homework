package com.lesson6;

import java.util.Scanner;

//3*) Пользователь вводит количество людей в группе, например 30. Вывести вероятность того что как минимум у 2 из них день рождение в 1 один день.

public class Homework6Task3 {

    public static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many people in your group?");
        int quantity = SCANNER.nextInt();
        System.out.printf("Fact that at least 2 people has same date of birth in one group " +
                "from %s people is %.2f percents", quantity, ((1-birthdayParadox(quantity))*100));
    }

    private static double birthdayParadox(int n) {
        if (n == 1) {
            return 1;
        }
            return ((1-(n-1)/365.0) * birthdayParadox(n - 1));
        }
    }
