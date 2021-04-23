package com.lesson5;

import java.util.Random;
import java.util.Scanner;

/*
2) Простая игра и цикл while:
Компьютер задумывает случайное число от 1 до 1000 и просит вас ввести число. После этого он говорит вы угадали или число больше/меньше.
Продолжается до тех пор пока пользователь не угадает число.
*/

public class Homework5Task2 {

    public static final Scanner SCANNER = new Scanner(System.in);
    public static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int computerValue = RANDOM.nextInt(1000) + 1; //+1 added to make RANDOM starts from 1 instead of 0;
        while (true) {
            System.out.println("Please enter your number from 1 to 1000 and try your luck :");
            int userValue = SCANNER.nextInt();
            if (computerValue == userValue) {
                System.out.println("Congratulations!!!!! You WIN!!!");
                break;
            } else {
                System.out.println(computerValue > userValue ? "My number is greater than yours" : "Your number is greater than my");
            }
        }
    }
}
