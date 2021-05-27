package com.lesson15;

public class Student {
    private String name;
    private String familyName;
    private String dateOfBirth;
    private String contact;

    public Student(String name, String familyName) {
        this.name = name;
        this.familyName = familyName;
    }

    public Student(String name, String familyName, String dateOfBirth, String contact) {
        this.name = name;
        this.familyName = familyName;
        this.dateOfBirth = dateOfBirth;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getContact() {
        return contact;
    }

}
