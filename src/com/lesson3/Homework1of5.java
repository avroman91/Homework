package com.lesson3;

import java.util.Scanner;

//Пользователь вводит 2 катета прямоугольного треугольника. Найти гипотенузу.

public class Homework1of5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first cathetus: ");
        int firstSide = scan.nextInt();
        System.out.println("Enter second cathetus: ");
        int secondSide = scan.nextInt();
        System.out.printf("The hypotenuse is%.2f", Math.hypot(firstSide, secondSide));
    }
}
