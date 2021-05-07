package com.lesson11;

import java.util.ArrayList;
import java.util.List;

public class HW11Task1 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            CreateRandomPerson person = new CreateRandomPerson();
            people.add(person.randomPerson());
        }
        System.out.println(people);
    }
}
