package com.example;

import org.springframework.stereotype.Component;

@Component
public class Phone {
    private String model="Iphone13";
    public String getModel() {
        return model;
    }
}
