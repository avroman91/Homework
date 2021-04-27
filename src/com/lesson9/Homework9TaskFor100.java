package com.lesson9;

/*Задан круг с радиусом r с центром в точке (x,y).
Вернуть список точек с целочисленными координатами которые попадают в круг.*/

import java.util.ArrayList;

public class Homework9TaskFor100 {
    public static void main(String[] args) {
        int[] center = {0, 0};
        int raduis = 5;
        System.out.println(returnListOfPointsInsideOfACircle(center, raduis));
    }

    public static String returnListOfPointsInsideOfACircle(int[] center, int radius) {
        ArrayList<String> list = new ArrayList<String>();
        for (int i = center[0] - radius + 1; i < center[0] + radius; i++) {
            for (int j = center[1] - radius + 1; j < center[1] + radius; j++) {
                if (isInCircle(center, i, j, radius)) {
                    list.add("(" + i + "," + j + ")");
                }
            }
        }
        return list.toString();
    }

    public static boolean isInCircle(int[] center, int pointX, int pointY, int radius) {
        return (pointX - center[0]) * (pointX - center[0]) + (pointY - center[1]) * (pointY - center[1]) < radius * radius;
    }
}
