package com.example.demo;

public class Customer {
    private String name;
    private String lastname;
    private int age;
    private boolean allowed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name= name;
    }

    public void setLastName(String lastName) {
        this.lastname = lastName;
    }

    public String getLastName() {
        return lastname;
    }
}
