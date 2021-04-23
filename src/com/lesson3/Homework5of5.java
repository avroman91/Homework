package com.lesson3;

//5*) Написать программу которая решает квадратное уравнене вида a*x*x + b*x + c = 0, где заданы a,b,c.

public class Homework5of5 {
    public static void main(String[] args) {
        int a = 5;
        int b = 25;
        int c = 30;
        double solution1;
        double solution2;
        int discriminant = (int) Math.pow(b, 2) - 4 * a * c;
        if (discriminant < 0) {
            System.out.println("The system has no solution");
        } else if (discriminant == 0) {
            solution1 = (-b / (2 * a));
            System.out.printf("The system has one solution: x= %.2f", solution1);
        } else {
            solution1 = ((-b + Math.sqrt(discriminant)) / (2 * a));
            solution2 = ((-b - Math.sqrt(discriminant)) / (2 * a));
            System.out.printf("The system has two solution: x1 = %.2f ; x2 = %.2f", solution1, solution2);
        }
    }
}
