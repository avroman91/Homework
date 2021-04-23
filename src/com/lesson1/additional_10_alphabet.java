package com.lesson1;

//10) Вывести англ. алфавит по 5 букв в строке

public class additional_10_alphabet {
    public static void main(String[] args) {
        char ch = 'a';
        int counter = 0;
        for (ch = 'a'; ch <= 'z'; ch++) {
            System.out.print(ch + "\t");
            counter++;
            if (counter == 5) {
                System.out.println();
                counter = 0;
            }
        }

    }
}

