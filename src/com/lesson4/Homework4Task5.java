package com.lesson4;

import java.util.Scanner;

/*5) Человек подтягивается лесенкой: 1 раз, 2 раза, 3 раза, итд.

- Подсчитать сколько он всего раз подтянется за N подходов, N задано с клавиатуры

5.1*) Каждое подтягивание занимает 5 секунд, первый перерыв между подходами 60 секунд.
Каждый следующий перерыв на 20% больше, вести общее время в формате mm:ss (например 15:45)*/

public class Homework4Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total quantity of \"ladder\" steps:");
        int steps = scanner.nextInt();
        int pullUp = 0;
        int currentstep = 0;
        int pullUpTime = 0;
        double delay = 60;
        double totalTimeSpent = 0;
        while (currentstep < steps) {
            for (int i = 0; i < currentstep + 1; i++) {
                pullUp++;
                pullUpTime += 5;
            }
            if (currentstep == 0) {
                totalTimeSpent = pullUpTime;
            } else {
                totalTimeSpent = totalTimeSpent + pullUpTime + delay;
                delay *= 1.2; //calculation for next iteration;
            }
            pullUpTime = 0; // reset of pullUpTime counter to start next iteration with 0 at pull-up timer
            currentstep++;
        }
        System.out.println("Total pull-up counts: " + pullUp);
        System.out.printf("Total time spent %s:%.0f", (int) (totalTimeSpent / 60), (totalTimeSpent % 60));
    }
}