package com.lesson11;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class RandomPersonGenerator {
    Random random = new Random();
    private int age = random.nextInt(10) + 10;
    private int height = random.nextInt(70) + 100;
    private int weight = random.nextInt(40) + 40;
    private String[] names = {"Will", "Mike", "Dustin", "Eleven", "Lucas", "Max"};
    private String[] familyNames = {"Byers", "Wheeler", "Handerson", "Familynameless", "Sinclair", "Mayfield"};
    private String[] dates = {"11.01.2001", "09.02.1991", "13.02.1985", "14.06.1957", "21.12.2000", "13.03.2003"};
    private int tmp = random.nextInt(6);
    private String name = names[tmp];
    private int tmp2 = random.nextInt(6);
    private String familyName = familyNames[tmp2]; // Names and family names are not random, they are from one of the Netflix series. (see name with index 3 in array or google it)
    private int randomDate = random.nextInt(6);
    private String dateOfBirth = dates[randomDate]; // Names and family names are not random, they are from one of the Netflix series. (see name with index 3 in array or google it)

    public Person generateNewRandomPerson() {
        Person generator = new Person(name, familyName, dateOfBirth, weight, height);
        return generator;
    }

}