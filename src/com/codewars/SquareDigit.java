package com.codewars;

public class SquareDigit {
    public static void main(String[] args) {
        System.out.println(squareDigits(9119));
    }

    public static int squareDigits(int n) {
        String tmp = Integer.toString(n);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tmp.length(); i++) {
            sb.append(Integer.parseInt(tmp.charAt(i) + "") * Integer.parseInt(tmp.charAt(i) + ""));
        }
        return Integer.parseInt(sb.toString());
    }

    public class SquareDigitBest {

        public int squareDigits(int n) {
            String result = "";

            while (n != 0) {
                int digit = n % 10;
                result = digit * digit + result;
                n /= 10;
            }

            return Integer.parseInt(result);
        }

    }

}
