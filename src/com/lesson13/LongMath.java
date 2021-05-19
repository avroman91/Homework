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

    public static String dev(String x, String y) {
        StringBuilder tmp = new StringBuilder();
        if (x.length() == y.length()) {
            for (int i = 0; i < x.length() - 1; i++) {
                if (Integer.parseInt(String.valueOf(x.charAt(i))) > Integer.parseInt(String.valueOf(y.charAt(i)))) {
                    tmp = devGreaterMinusSmaller(x,y);
                    break;
                } else if (Integer.parseInt(String.valueOf(x.charAt(i))) < Integer.parseInt(String.valueOf(y.charAt(i)))) {
                    tmp = devGreaterMinusSmaller(y,x);
                    tmp.insert(0, "-");
                    break;
                }
            }
        }
        return tmp.toString();
    }

    private static StringBuilder devGreaterMinusSmaller(String x, String y) {
        StringBuilder st = new StringBuilder();
        int doz = 0;
        for (int i = 1; i < x.length() + 1; i++) {
            int tmp = Integer.parseInt(String.valueOf(x.charAt(x.length() - i))) - Integer.parseInt(String.valueOf(y.charAt(y.length() - i))) - doz;
            if (tmp < 0) {
                doz = 1;
                tmp = 10 + tmp;
            } else {
                doz = 0;
            }
            st.insert(0, tmp);
        }
        return st;
    }

}
