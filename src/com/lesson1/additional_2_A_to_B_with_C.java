package com.lesson1;

//2) Даны две переменных типа int  с некоторыми значениями. Поменять местами значения этих переменных


public class additional_2_A_to_B_with_C {
    public static void main(String[] args) {

        int a = -189;
        int b = 36;
        System.out.println("Переменная а = " + a + "\nПеременная b = " + b);
        int c = a;
        a = b;
        b = c;
        System.out.println("\nПосле замены: \nПеременная а = " + a + "\nПеременная b = " + b);

    }
}
