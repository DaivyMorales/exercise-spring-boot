package com.example.exercise;

public class ClassPeople {
    private String name;
    private String lastName;
    private int age;

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


    public ClassPeople(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }
}
