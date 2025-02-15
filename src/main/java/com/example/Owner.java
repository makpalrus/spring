package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Owner {
    private final Phone phone;
    private final SimCard simCard;

    @Autowired
    public Owner(Phone phone, SimCard simCard) {
        this.phone = phone;
        this.simCard = simCard;
    }

    public void showInfo() {
        System.out.println("Телефон владельца: " + phone.getModel());
        System.out.println("Номер SIM-карты: " + simCard.getNumber());
    }
}
