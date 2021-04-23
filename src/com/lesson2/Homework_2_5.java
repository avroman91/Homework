package com.lesson2;

/*5) Население земли 7.5 миллиарда.

Если предположить что каждый год оно будет увеличиваться на 10% вывести количество людей через 3 года.*/

public class Homework_2_5 {
    public static void main(String[] args) {
        long population = 7_500_000_000L;
        byte howManyYears = 3;
        byte year;
        for (year = 0; year < howManyYears; year++) {
            population = population + population / 10;
        }
        System.out.printf("After %s years population of the Earth will be:  %s", year, population);
    }
}
