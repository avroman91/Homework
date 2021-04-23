package com.lesson2;

import java.util.Scanner;

public class Homework_2_10 {
    public static void main(String[] args) {
        System.out.println("Enter your value: ");
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        System.out.printf("Your value in binary system : %s ; and in hexadecimal system : %s", Integer.toBinaryString(value), Integer.toHexString(value));
    }
}
