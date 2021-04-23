package com.lesson6;

import java.util.Random;

/*1) Подсчитать вероятность при помощи Random и большого количество повторений:
- сумма значиний при броске 2 кубиков равна 7
- на всех 3 кубиках значения разные
- на 3 монетках выпало одна сторона
*/

public class Homework6Task1 {

    private static final Random RANDOM = new Random();
    private static final int COUNT = 1_000_000;

    public static void main(String[] args) {
        int twoDiceSumSeven = 0;
        for (int i = 0; i < COUNT; i++) {
            int dice1 = dice();
            int dice2 = dice();
            if (dice1 + dice2 == 7) {
                twoDiceSumSeven++;
            }
        }
        System.out.println("Two dice sum = 7 is posible with chance : " + (double) twoDiceSumSeven / COUNT * 100 + "%");
        int threeDice = 0;
        for (int i = 0; i < COUNT; i++) {
            int dice1 = dice();
            int dice2 = dice();
            int dice3 = dice();
            if (dice1 != dice2 && dice2 != dice3 && dice1 != dice3) {
                threeDice++;
            }
        }
        System.out.println("Three dice different value - posible with chance: " + (double) threeDice / COUNT * 100 + "%");
        int threeCoinsSame = 0;
        for (int i = 0; i < COUNT; i++) {
            int coin1 = coin();
            int coin2 = coin();
            int coin3 = coin();
            if (coin1 == coin2 && coin2 == coin3) {
                threeCoinsSame++;
            }
        }
        System.out.println("Three coins fell on the same side - posible with chance: " + (double) threeCoinsSame / COUNT * 100 + "%");
    }

    public static int dice() {
        return RANDOM.nextInt(6) + 1;
    }

    public static int coin() {
        return RANDOM.nextInt(2);
    }
}