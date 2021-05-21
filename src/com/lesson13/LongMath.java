package com.lesson13;
/*
Заполните на 100 баллов:
Написать класс который реализует 4 арифметическое операции + - * / для длинных чисел которые заданные как строка
Например:
String s = LongMath.sum("123", "456");
Размер чисел не ограничен, хоть 1000 символов. Не использовать готовые библиотеки типа LongInt
*/
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
        if (doz == 1 && (st.length() - limit > 0)) {
            int dozRepair = Integer.parseInt(String.valueOf(st.charAt(st.length() - limit))) + doz;
            st.replace(st.length() - limit, st.length() - limit + 1, String.valueOf(dozRepair));
        }
        else if (doz == 1 && (Integer.parseInt(x.substring(0,1)) + Integer.parseInt(y.substring(0,1))) >= 10) {
            st.insert(0,doz);
        } else {
            st.replace(0,1, String.valueOf((Integer.parseInt(st.substring(0,1))+doz)));

        }
        return st.toString();
    }

    public static String subtraction(String x, String y) {
        StringBuilder tmp = new StringBuilder();
        if (x.length() == y.length()) {
            for (int i = 0; i < x.length() - 1; i++) {
                if (Integer.parseInt(String.valueOf(x.charAt(i))) > Integer.parseInt(String.valueOf(y.charAt(i)))) {
                    tmp = greaterMinusSmallerValue(x, y);
                    break;
                } else if (Integer.parseInt(String.valueOf(x.charAt(i))) < Integer.parseInt(String.valueOf(y.charAt(i)))) {
                    tmp = greaterMinusSmallerValue(y, x);
                    tmp.insert(0, "-");
                    break;
                } else {
                    for (int j = 0; j < x.length(); j++) {
                        if (Integer.parseInt(String.valueOf(x.charAt(j))) > Integer.parseInt(String.valueOf(y.charAt(j)))) {
                            tmp = greaterMinusSmallerValue(x, y);
                            break;
                        } else if (Integer.parseInt(String.valueOf(x.charAt(j))) < Integer.parseInt(String.valueOf(y.charAt(j)))) {
                            tmp = greaterMinusSmallerValue(y, x);
                            tmp.insert(0, "-");
                            break;
                        }
                    }
                    if (tmp.length() == 0) {
                        tmp.insert(0, "0");
                    }
                }
            }
        } else if (x.length() > y.length()) {
            tmp = greaterMinusSmallerValue(x, y);
        } else {
            tmp = greaterMinusSmallerValue(y, x);
            tmp.insert(0, "-");
        }
        return tmp.toString();
    }


    private static StringBuilder greaterMinusSmallerValue(String x, String y) {
        StringBuilder st = new StringBuilder();
        int doz = 0;
        for (int i = 1; i < y.length() + 1; i++) {
            int tmp = Integer.parseInt(String.valueOf(x.charAt(x.length() - i))) - Integer.parseInt(String.valueOf(y.charAt(y.length() - i))) - doz;
            if (tmp < 0) {
                doz = 1;
                tmp = 10 + tmp;
            } else {
                doz = 0;
            }
            st.insert(0, tmp);
        }
        if (st.length() < x.length() && doz == 0) {
            int difference = x.length() - st.length();
            st.insert(0, x.substring(0, difference));
        }
        while (true) {
            if (Integer.parseInt(String.valueOf(st.charAt(0))) == 0) {
                st.delete(0, 1);
            } else {
                break;
            }
        }
        return st;
    }

    public static String division(String x, String y) {
        if (y.length() == 1 && Integer.parseInt(String.valueOf(y.charAt(0))) == 0) {
            return "Dividing by zero is prohibited";
        }
        int counter = 0;
        while (true) {
            if (x.length() > y.length() || (x.length() == y.length() && x.charAt(0) >= y.charAt(0))) {
                x = subtraction(x, y);
                if (x.charAt(0) != '-') {
                    counter++;
                }
            } else {
                break;
            }
        }
        return String.valueOf(counter);
    }

    public static String mult(String x, String y) {
        String tmp = x;
        for (int i = 0; i < y.length(); i++) {
            int steps = Integer.parseInt(String.valueOf(y.charAt(y.length() - i - 1)));
            steps = (int) (steps * (Math.pow(10, i)));
            while (steps != 0) {
                tmp = sum(tmp, x);
                steps--;
            }
        }
        return LongMath.subtraction(tmp,x);
    }
}
