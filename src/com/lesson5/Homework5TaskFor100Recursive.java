package com.lesson5;

/*
Вывести все перестановки строки, 2мя способами: через рекурсию и через цикл. например для строки abc:
abc, acb, bac, bca, cab, cba.
*/

public class Homework5TaskFor100Recursive {

    public static void main(String[] args) {
        String s = "abc"; //Put here your string to make all possible permutations;
        permutation(s, "");
        System.out.println();
    }

    static void permutation(String str, String answer) {

        if (str.length() == 0) { //когда остается 0 символов - печатается найденная комбинация и пробел
            System.out.print(answer + " ");
        }
        for (int i = 0; i < str.length(); i++) {  //Если длинна оставшейся строки меньше i - текущая рекурсия заканчивается;
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1); // временно записывается вся строка за исключением буквы с индексом i
            permutation(ros, answer + ch); //рекурсия , обратно в метод возвращается оставшаяся строка + все остальные буквы (как ответ)
        }
    }
}

