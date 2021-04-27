package com.codewars;

public class Printer {

    public static String printerError(String s) {
        String aToM = "abcdefghijklmABCDEFGHIJKLM";
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!aToM.contains(s.charAt(i) + "")) {
                counter++;
            }
        }
        return String.format("%s/%s", counter, s.length());
    }

    public static String printerErrorBestSolution(String s) {
        return s.replaceAll("[a-m]", "").length() + "/" + s.length();
    }
}
