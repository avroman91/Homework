package com.lesson8;

import com.BasicFunctions;

/*This new version calculate quantity of the lucky tickets in next way :
If tickets has 6 digits and starts from 000 001 , ends 999 999 , it means that first part sum will equal second part sum
and will equal min. 1 (for 001 001) and max. 27 (for 999 999).  If we will make an array with all numbers from 1 to 27 ,
and increment array [0] by 1 when sum of the digits in "i" will equal (1), array[1]++ when sum will equal 2 and etc.
At the end we will receive array with an array[27] , each element of which will tell us how many values from 001 to 999 has sum
of the digits equals (array index +1 ). For array[0]  it is 3 (001, 010, 100) and etc.
But each array index has same part from other side of the ticket number, so total quantity of lucky tiсkets with sum 1 will be 9
(001 001, 001 010, 001 100 and etc).
Total quantity of lucky tickets will be sum of all values in the array, each value should be squared.*/

public class Homework8Task2NewVersion {
    public static void main(String[] args) {
        int[] array = new int[27];
        int quantityOfLuckyTicket = 0;
        for (int i = 1; i <= 999; i++) {
            array[BasicFunctions.sumAllDigitsInInt(i) - 1]++;
        }
        for (int j : array) {
            quantityOfLuckyTicket += Math.pow(j, 2);
        }
        System.out.println(quantityOfLuckyTicket);
    }
}
