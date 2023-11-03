package com.example.exercise;

public class ClassPeople {
    private int id;
    private String name;
    private String lastName;
    private int age;

    // ID
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // NAME
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // LASTNAME
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // AGE
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ClassPeople(int id, String name, String lastName, int age) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
}
