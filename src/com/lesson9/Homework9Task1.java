package com.lesson9;

/*1) В банк положили S денег. Какой станет сумма вклада через N лет, если процент 1,5% добавляется к сумме вклада ежемесячно.*/

public class Homework9Task1 {

    public static final double MONEY = 10000;
    public static final int YEARS_OF_DEPOSIT = 1;

    public static void main(String[] args) {
        System.out.printf("After %s year(s) with your deposit %.0f UAH you will return from bank %.2f UAH" ,
                YEARS_OF_DEPOSIT, MONEY, returnFromBank(MONEY, YEARS_OF_DEPOSIT * 12));
    }

    public static double returnFromBank(double money, int months) {
        return months == 0 ? money : (returnFromBank(money, months - 1) * 1.015);
    }
}
