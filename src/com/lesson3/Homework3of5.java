package com.lesson3;

//3) Вычислить прощадь треугольника по 3 сторонам или написать что такой треугольник не существует.

public class Homework3of5 {
    public static void main(String[] args) {
        int firstSide = 100;
        int secondSide = 1;
        int thirdSide = 1;
        int halfPerimeter = (firstSide + secondSide + thirdSide) / 2;
        double s = Math.sqrt(halfPerimeter * (halfPerimeter - firstSide) * (halfPerimeter - secondSide) * (halfPerimeter - thirdSide));
        if (Double.isNaN(s)) {
            System.out.println("There is no triangle with entered sides");
        } else {
            System.out.printf("The area of triangle is %.2f", s);
        }
    }
}