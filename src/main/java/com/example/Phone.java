package com.example;

import org.springframework.stereotype.Component;
public class Phone {
    private String model;
    private SimCard simCard;
    private Owner owner;

    public Phone(String model, SimCard simCard, Owner owner) {
        this.model = model;
        this.simCard = simCard;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Телефон: " + model + ", " + simCard + ", Владелец: " + owner;
    }
}
