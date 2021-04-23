package com.lesson2;


/*1. Не используя методы String - contains, indexOf,  lastIndexOf определить входит ли подстрока в строку.
1.1. Найти все вхождения подстроки в строку.*/


public class Substring_problem {
    public static void main(String[] args) {
        String input = "Java is not so simple";
        String find = "ava";
        StringBuffer found = new StringBuffer();
        int count = 0;
        int j = 0;
        for (int i = 0; i < input.length(); ) {
            j = 0;
            while (j < find.length() && i < input.length() && input.charAt(i) == find.charAt(j)) {
                found.append(input.charAt(i));
                j++;
                i++;
            }
            i = i - j;
            if (found.toString().equals(find)) {
                count++;
            }
            i++;
            found.setLength(0);
        }
        if (count == 0)
            System.out.println("Not found");
        else
            System.out.println("count is " + count);
    }
}
