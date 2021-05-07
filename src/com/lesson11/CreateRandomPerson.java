package com.lesson11;

import java.util.Random;

public class CreateRandomPerson {
    Random random = new Random();
    private int age = random.nextInt(10) + 10;
    private int height = random.nextInt(70) + 100;
    private int weight = random.nextInt(40) + 40;
    private String[] names = {"Will", "Mike", "Dustin", "Eleven", "Lucas", "Max"};
    private String[] familyNames = {"Byers", "Wheeler", "Handerson", " ", "Sinclair", "Mayfield"};
    private int tmp = random.nextInt(6);
    private String name = names[tmp];
    private String familyName = familyNames[tmp];

    public Person randomPerson() {
        Person person = new Person(name, familyName, age, weight, height);
        return person;
    }


}
