package com.lesson3;

import java.util.ArrayList;

public class TaskFor100 {
    public static void main(String[] args) {
        int num = 100; // ordinal number of a prime number
        int testValue = 3;
        int primeNumberChecking = 1;
        int internalCounter2 = 1;
        int internalCounter3 = 0;
        int iteration = 0;
        ArrayList<Integer> array = new ArrayList<>();
        array.add(2);


        if (num == 1) {
            testValue = 2;
        } else
            while (primeNumberChecking < num) {
                iteration++;
                internalCounter2++;
                if (testValue % array.get(internalCounter2 - 2) == 0) {
                    internalCounter3++;
                }
                if (internalCounter3 == 1 & testValue != internalCounter2) {
                    testValue++;
                    internalCounter2 = 1;
                    internalCounter3 = 0;
                } else {
                    if ((internalCounter3 == 1) || (internalCounter3 == 0 && internalCounter2 >= Math.sqrt(testValue))) {
                        primeNumberChecking++;
                        if (primeNumberChecking == num) {
                            break;
                        }
                        array.add(testValue);
                        testValue++;
                        internalCounter2 = 1;
                        internalCounter3 = 0;
                    }
                }
            }
        System.out.printf("Prime number with a ordinal No. %s is %s , founder for %s iterations ", num, testValue, iteration);
    }
}
