package com.lesson4;

import java.util.Scanner;

/*2) Оператор swtich-case:
Пользователь вводит целое число - код ошибки.
Если 200, 201, 202 или 204 вывести - Success
Если 301 или 302 - Redirection
Если 400, 401 или 404 - Client Error
Если 500, 502, 503 или 504 - Server Error*/

public class Homework4Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter error code: ");
        int receivedValue = scanner.nextInt();
        switch (receivedValue) {
            case 200:
            case 201:
            case 202:
            case 204:
                System.out.println("Success");
                break;
            case 301:
            case 302:
                System.out.println("Redirection");
                break;
            case 400:
            case 401:
            case 404:
                System.out.println("Client Error");
                break;
            case 500:
            case 502:
            case 503:
            case 504:
                System.out.println("Server Error");
                break;
            default:
                System.out.println("Entered wrong error code");
        }
    }
}