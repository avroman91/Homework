package com.lesson13;

import com.lesson11.Person;

import java.util.Calendar;
import java.util.GregorianCalendar;

/*
2*) Вместо поля возраст добавить поле дата рождения как строка типа "18.12.1985"
- добавить метод который выводит количество полных лет на данным момент.
*/

public class HW13Task2 extends HW13Task1 {

    public static void main(String[] args) {

        Person[] peopleSet = getPeople(hundrentOfPersons()).toArray(new Person[0]);
        System.out.println(peopleSet[1].getDateOfBirth());
        System.out.println(getAge(peopleSet[1]));
    }

    private static int getAge(Person person) {
        String doB = person.getDateOfBirth();
        Calendar calendar = new GregorianCalendar();
        int age = 0;
        if (Integer.parseInt(person.getDateOfBirth().substring(3, 5)) == calendar.get(Calendar.MONTH)) {
            if (calendar.get(Calendar.DATE) >= Integer.parseInt(person.getDateOfBirth().substring(0, 2))) {
                age = calendar.get(Calendar.YEAR) - Integer.parseInt(person.getDateOfBirth().substring(6, 10));
            } else {
                age = calendar.get(Calendar.YEAR) - Integer.parseInt(person.getDateOfBirth().substring(6, 10)) - 1;
            }
        } else if (Integer.parseInt(person.getDateOfBirth().substring(3, 5)) > calendar.get(Calendar.MONTH)) {
            age = calendar.get(Calendar.YEAR) - Integer.parseInt(person.getDateOfBirth().substring(6, 10)) - 1;
        } else {
            age = calendar.get(Calendar.YEAR) - Integer.parseInt(person.getDateOfBirth().substring(6, 10));
        }
        return age;
    }
}
