package com.lesson2;

import java.util.Scanner;

/*4) Попросить пользователя ввести месяц.

Вывести какая это пора года, или сказать что месяц введен с ошибкой.*/

public class Homework_2_4 {
    public static void main(String[] args) {
        System.out.println("Enter name of the month :");
        Scanner month = new Scanner(System.in);
        String monthReceived = month.next();
        String monthLowerCase = monthReceived.toLowerCase();
        if (monthLowerCase.matches("january") | monthLowerCase.matches("february") | monthLowerCase.matches("december")) {
            System.out.println("It's winter in Ukraine at this time!");
        } else if (monthLowerCase.matches("march") | monthLowerCase.matches("april") | monthLowerCase.matches("may")) {
            System.out.println("It's spring in Ukraine at this time!");
        } else if (monthLowerCase.matches("june") | monthLowerCase.matches("july") | monthLowerCase.matches("august")) {
            System.out.println("It's summer in Ukraine at this time!");
        } else if (monthLowerCase.matches("september") | monthLowerCase.matches("october") | monthLowerCase.matches("november")) {
            System.out.println("It's autumn in Ukraine at this time!");
        } else {
            System.out.println("Month entered incorrectly!!");
        }
    }
}
