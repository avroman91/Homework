package com.lesson1;

import java.util.Scanner;

public class additional_1_speed {
    public static void main(String[] args) {
        System.out.println("Введите время в минутах:");
        Scanner time = new Scanner(System.in);
        int t_in = time.nextInt();
        System.out.println("Введите расстояние в километрах");
        Scanner dist = new Scanner(System.in);
        int dist_in = dist.nextInt();

        double t = t_in * 60;
        double d = dist_in * 1000;
        double speed;
        speed = d / t;

        System.out.println("Ваша скорость составит " + speed + " м/с");

    }
}
