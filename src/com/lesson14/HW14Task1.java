package com.lesson14;

/*
1) Дополнить класс IntList;
https://gist.github.com/akadatsky/4aa0f9ee381c54194aa0dd54f138de7f
Необходимо создать класс аналогичный стандартному ArrayList<Integer> на базе массива.

Реализовать 5 методов:
add - добавить значеине в список
get - получить по индексу
set - заменить по индексу
size - верзнуть размер, изначально 0
toString - красиво печатет список

Логика метода add:
создаем временный массив на 1 елемент больше чем arr, копируем в него все элементы из arr,
на последнюю позицию записыаем новый елемент и заменяем arr на временный массив.
*/

public class HW14Task1 {

    public static void main(String[] args) {
        IntList list = new IntList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.set(1, 123);
        System.out.println(list); // [10, 123, 30]
    }
}
