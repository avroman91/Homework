package com.lesson1;


//4) Пользователь вводит номер месяца. Вывести название поры года (весна, лето и т.д.)


import java.util.Scanner;

public class additional_4_season {
    public static void main(String[] args) {
        System.out.println("Введите номер месяца от 1 до 12 :");
        Scanner month = new Scanner(System.in);
        int a = month.nextInt();
        if (a >= 1 & a <= 12) {

            if (a == 12 | a == 1 | a == 2) System.out.println("В это время в Украине зима!");
            if (a >= 3 & a <= 5) System.out.println("В это время в Украине весна!");
            if (a >= 6 & a <= 8) System.out.println("В это время в Украине лето!");
            if (a >= 9 & a <= 11) System.out.println("В это время в Украине осень!");

        } else System.out.println("Номер месяца введен неверно!!!");


    }

}
