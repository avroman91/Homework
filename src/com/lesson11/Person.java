package com.lesson11;


/*1. Создать класс Person который описывает человека, с полями: имя, фамилия, возраст, вес, рост.
Создать один или несколько конструкторов которые гарантирует что у каждого есть имя, фамилия.
Создать список из 100 обьектов типа Person заполненных случайными данными (Например создать массив на несколько имен и выбирать из него случайным образом).
Код который создает список Person и заполняет его данными разместить в другом классе, не в Person.
Обеспечить чтобы случайные данные (вес, рост, возраст) выглядели правдоподобно:
не было человека весом 3 кг и ростом 180 итд.
*/
public class Person {

    private String name;
    private String familyName;
    private int age;
    private int weight;
    private int height;

    public Person(String name, String familyName, int age, int weight, int height) {
        this.name = name;
        this.familyName = familyName;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public Person(String name, String familyName) {
        this.name = name;
        this.familyName = familyName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", familyName='" + familyName + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
