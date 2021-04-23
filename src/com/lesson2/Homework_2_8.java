package com.lesson2;

/*8*) Попросить пользователя ввести 3 целых числа (int).

Вывести их среднее арифметическое.*/

import java.util.Scanner;

public class Homework_2_8 {
    public static void main(String[] args) {
        float sum = 0;
        int i;


        for (i = 1; i <= 3; i++) {
            if (i == 1) System.out.println("Enter the number: ");
            else System.out.println("Enter one more number");
            Scanner inputValue = new Scanner(System.in);
            int receivedValue = inputValue.nextInt();
            sum = sum + receivedValue;
        }
        System.out.printf("The arithmetic mean will be: %.2f", sum / (i - 1));

    }

}

