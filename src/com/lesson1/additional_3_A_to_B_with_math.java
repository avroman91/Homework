package com.lesson1;

//3) сделать то же самое не используя дополнительных переменных


public class additional_3_A_to_B_with_math {
    public static void main(String[] args) {
        int a = -189;
        int b = 36;
        System.out.println("Переменная а = " + a + "\nПеременная b = " + b);
        a += b;
        b = a - b;
        a = a - b;
        System.out.println("\nПосле замены: \nПеременная а = " + a + "\nПеременная b = " + b);
    }
}
