package com.lesson13;

import com.lesson11.Person;
import com.lesson11.RandomPersonGenerator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*1) Взять спискок из 100 человек из предыдущей задачи.
Написть метод:
Входящий параметр: список всех людей
Результат: список людей с уникальными комбинацияи Имя+Фамилия.
Другими словами метод должен убрать из списка все дубликаты по имени-фамсилии. Остальные поля в расчет дубликатов не берутся.
*/

public class HW13Task1 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            RandomPersonGenerator generator = new RandomPersonGenerator();
            people.add(generator.generateNewRandomPerson());
        }
        System.out.println(getPeople(people));
        System.out.println(getPeople(people).size());

    }

    private static Set<Person> getPeople(List<Person> people) {
        return new HashSet<>(people);
    }

}
