package com.example;

import org.springframework.stereotype.Component;


public class Owner {
    private String name;
    private int age;

    public Owner(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return   name + ", возраст: " + age;
    }
}
