package com.lesson7;

// 3*) Написать метод который проверяет состоит ли строка из одних только цифр. Метод должен вернуть true или false

public class Homework7Task3 {
    public static void main(String[] args) {
        String string = "123";
        System.out.println(myMethod(string));

    }

    public static boolean myMethod(String string) {  //Method returns "true" if all charterer of the string are only digits.
        for (int i = 0; i < string.length(); i++) {
            if (!Character.isDigit(string.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
