package com.example.demo.customer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Date;

public class Customer {
    private String name;

    public Customer() {
    }

    public Customer(String name, String lastname, boolean allowed, LocalDate birthday) {
        this.name = name;
        this.lastname = lastname;
        this.allowed = allowed;
        this.birthday = birthday;

        calculateAge();
    }

    private String lastname;
    private int age;
    private boolean allowed;
    private LocalDate birthday;


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

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public void calculateAge(){
        Period period = Period.between(this.birthday, LocalDate.now());

        setAge(period.getYears());

    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", allowed=" + allowed +
                ", birthday=" + birthday +
                '}';
    }
}
