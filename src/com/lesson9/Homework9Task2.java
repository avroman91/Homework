package com.lesson9;

/*2) Реализовать метод который вернет строку String, в которой через пробел все числа от 1 до 99 со следующими изменениями:
- если число кратно 3 то вывести вместо него Hello

- если число кратно 5 то вывести вместо него World

- если число кратно и 3 и 5 то вывести вместо него HelloWorld
*/

public class Homework9Task2 {
    public static void main(String[] args) {
        System.out.println(returnString());
    }

    private static String returnString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 99; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                sb.append(i).append(" ");
            } else if (i % 3 == 0 && i % 5 == 0) {
                sb.append("HelloWorld ");
            } else if (i % 3 == 0) {
                sb.append("Hello ");
            } else {
                sb.append("World ");
            }
        }
        return sb.toString();
    }
}