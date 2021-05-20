package com.lesson11;

/*1. Создать класс Person который описывает человека, с полями: имя, фамилия, возраст, вес, рост.
Создать один или несколько конструкторов которые гарантирует что у каждого есть имя, фамилия.
Создать список из 100 обьектов типа Person заполненных случайными данными (Например создать массив на несколько имен и выбирать из него случайным образом).
Код который создает список Person и заполняет его данными разместить в другом классе, не в Person.
Обеспечить чтобы случайные данные (вес, рост, возраст) выглядели правдоподобно:
не было человека весом 3 кг и ростом 180 итд.
*/

import java.util.Objects;

public class Person {

    private String name;
    private String familyName;
    private String dateOfBirth;
    private int weight;
    private int height;

    public Person(String name, String familyName, String dateOfBirth, int weight, int height) {
        this.name = name;
        this.familyName = familyName;
        this.dateOfBirth = dateOfBirth;
        this.weight = weight;
        this.height = height;
    }

    public Person(String name, String familyName, String dateOfBirth) {
        this.name = name;
        this.familyName = familyName;
        this.dateOfBirth = dateOfBirth;
    }

    public Person(String name, String familyName) {
        this.name = name;
        this.familyName = familyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(familyName, person.familyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, familyName);
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", familyName='" + familyName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}