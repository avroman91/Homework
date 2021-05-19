package com.lesson13;

public class LongMath {
    public static String sum(String x, String y) {
        StringBuilder st = new StringBuilder();
        int doz = 0;
        int limit = x.length() >= y.length() ? y.length() + 1 : x.length() + 1;

        for (int i = 1; i < limit; i++) {
            int tmp = doz + Integer.parseInt(String.valueOf(x.charAt(x.length() - i))) + Integer.parseInt(String.valueOf(y.charAt(y.length() - i)));
            if (tmp >= 10) {
                doz = tmp / 10;
                tmp = tmp % 10;
            } else {
                doz = 0;
            }
            st.insert(0, tmp);
        }
        st.insert(0, x.length() > y.length() ? x.substring(0, x.length() - y.length()) : "");
        st.insert(0, x.length() < y.length() ? y.substring(0, y.length() - x.length()) : "");
        return st.toString();
    }
}
