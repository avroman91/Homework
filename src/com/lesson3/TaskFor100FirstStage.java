package com.lesson3;

import java.util.ArrayList;

public class TaskFor100FirstStage {
    public static void main(String[] args) {
        int checkForPrime = 9526; // Check for a prime number
        int internalCounter1 = 0;
        int internalCounter2 = 0;
        int internalCounter3 = 1;
        ArrayList<Integer> arr = new ArrayList<>();
        int testValue = 3;
        arr.add(2);
        if (checkForPrime == 2) {
            System.out.println("2 - is not a prime number. \nIt can be presented ad 2=2");
        } else {
            while (testValue <= checkForPrime) {
                internalCounter3++;
                if (testValue % arr.get(internalCounter3 - 2) == 0) {
                    internalCounter2++;
                }
                if (internalCounter2 == 1 & testValue != internalCounter3) {
                    testValue++;
                    internalCounter3 = 1;
                    internalCounter2 = 0;
                } else {
                    if ((internalCounter2 == 1) || (internalCounter2 == 0 && internalCounter3 >= Math.sqrt(testValue))) {
                        arr.add(testValue);
                        testValue++;
                        internalCounter3 = 1;
                        internalCounter2 = 0;
                    }
                }
            }
            while (internalCounter1 < Math.sqrt(checkForPrime)) {
                if (checkForPrime % arr.get(internalCounter1) == 0) {
                    internalCounter2++;
                }
                internalCounter1++;
            }
            if (internalCounter2 > 1) {
                ArrayList<Integer> array2 = new ArrayList<>();
                int request = 0;
                int left = checkForPrime;
                StringBuilder answer = new StringBuilder();
                while (left != 1) {
                    if (left % arr.get(request) == 0) {
                        array2.add(arr.get(request));
                        left = left / arr.get(request);
                        answer.append("*" + arr.get(request));
                    } else {
                        request++;
                    }
                }
                answer.deleteCharAt(0);
                System.out.printf("%s is not a prime number.\nIt can be presented as %s=%s\n", checkForPrime, checkForPrime, answer);
            } else {
                System.out.printf("%s is a prime number. \n", checkForPrime);
            }
        }
    }
}