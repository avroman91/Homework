package com.lesson8;

/*
1) Электронные часы показывают время в формате от 00:00 до 23:59.
Подсчитать сколько раз за сутки случается так, что слева от двоеточия показывается симметричная комбинация для той, что справа от двоеточия (например, 02:20, 11:11 или 15:51).
*/

public class Homework8Task1 {
    public static void main(String[] args) {
        StringBuilder st = new StringBuilder();
        int counter = 0;
        for (int i = 0; i < 24; i++) {
            if (i < 10) {
                st.append("0").append(i);
            } else {
                st.append(i);
            }
            if (Integer.parseInt(st.reverse().toString()) < 60) {
                counter++;
            }
            st.delete(0, st.length());
        }
        System.out.println(counter + " times in 24 hours you can see on the digital watches time with symmetric combination");
    }
}