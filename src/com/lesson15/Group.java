package com.lesson15;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String courseName;
    private String startDate;
    private int lessonCount;
    private int lessonPerWeek;
    private final List<Student> studentList = new ArrayList<>();

    public Group(String courseName, String startDate, int lessonCount, int lessonPerWeek) {
        this.courseName = courseName;
        this.startDate = startDate;
        this.lessonCount = lessonCount;
        this.lessonPerWeek = lessonPerWeek;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    @Override
    public String toString() {
        return courseName + '_' + startDate;
    }

    public void printList() {
        for (Student student : studentList) {
            System.out.println(student.getName().charAt(0) + "." + student.getFamilyName());
        }
        ;
    }

    public void deteleStudent(String familyName) {
        studentList.removeIf(student -> student.getFamilyName().equals(familyName));
    }

    public boolean hasStudent(String familyName) {
        for (Student student : studentList) {
            if (student.getFamilyName().equals(familyName)) {
                return true;
            }
        }
        return false;
    }
}
