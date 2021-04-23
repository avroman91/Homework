package com.lesson2;

import java.util.Scanner;

/*3) Попросить пользователя ввести ФИО (3 разные переменные).

Используя один оператор print() вывести в ФИО 3 строки ("\n").*/

public class Homework_2_3 {
    public static void main(String[] args) {
        System.out.println("Enter your Family Name: ");
        Scanner familyNameInput = new Scanner(System.in);
        String familyName = familyNameInput.next();
        System.out.println("Enter Your Name: ");
        Scanner nameInput = new Scanner(System.in);
        String name = nameInput.next();
        System.out.println("Enter Your Father's Name: ");
        Scanner fathersNameInput = new Scanner(System.in);
        String fathersName = fathersNameInput.next();
        System.out.print(familyName + "\n" + name + "\n" + fathersName);
    }
}
