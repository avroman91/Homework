package com.lesson15;

public class Main {
    public static void main(String[] args) {
        Group group = new Group("Java Introduction", "29.03.2021", 16, 2);
        group.addStudent(new Student("Roman", "Romanov"));
        group.addStudent(new Student("Ivan", "Ivanov"));
        group.addStudent(new Student("Sergei", "Synergetic"));

        System.out.println(group);
        group.printList();
        System.out.println(group.hasStudent("Synergetic"));
        group.deteleStudent("Synergetic");
    }
}
