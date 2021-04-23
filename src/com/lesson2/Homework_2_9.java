package com.lesson2;

/*9*) Создать jar файл "calculator.jar" которому через консоль передают 3 парамтера, числа a,b и тип операции: add, sub, mul, div (+ - * /). Программа должна вывести результат в консоль.

В качестве отвата предоставить код и jar файл.*/


public class Homework_2_9 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        String c = args[2];


        if (c.matches("add")) {
            System.out.printf("Sum: %s ", a + b);
        } else if (c.matches("sub")) {
            System.out.printf("Sub: %s ", a - b);
        } else if ((c.matches("div")) && b != 0) {
            System.out.printf("Div: %s ", a / b);
        } else if (c.matches("mul")) {
            System.out.printf("Mul: %s ", a * b);
        } else {
            System.out.println("Entered wrong operation");
        }


    }

}
