package com.lesson8;

//2) Найти количество счастливых билетиков на трамвай от 000001 до 999999 (те у которых сумма первых 3 цифр равна сумме последних 3)

public class Homework8Task2 {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i <= 999; i++) {
            int hundredsI = i / 100;
            int dozensI = (i - hundredsI * 100) / 10;
            int digitsI = (i - hundredsI * 100 - dozensI * 10);
            for (int j = 0; j <= 999; j++) {

                int hundredsJ = j / 100;
                int dozensJ = (j - hundredsJ * 100) / 10;
                int digitsJ = (j - hundredsJ * 100 - dozensJ * 10);
                if (hundredsI + dozensI + digitsI == hundredsJ + dozensJ + digitsJ) {
                    counter++;
                }
            }
        }
        System.out.println("The total quantity of lucky tickets is : " + counter + " pcs");
    }
}