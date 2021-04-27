package com.codewars;

import java.util.Arrays;
import java.util.List;

public class BinaryArrayToNumber {
    public static void main(String[] args) {
        System.out.println(ConvertBinaryArrayToIntBestSolution((Arrays.asList(0, 0, 0, 1))));
    }

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        String result = "";
        for (Integer integer : binary) {
            result += integer;
        }
        return Integer.parseInt(result, 2);
    }


    public static int ConvertBinaryArrayToIntBestSolution(List<Integer> binary) {
        return binary.stream().reduce((x, y) -> x * 2 + y).get();
    }
}
