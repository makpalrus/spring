package com.example;

import org.springframework.stereotype.Component;


public class SimCard {
    private String provider;
    private String number;

    public SimCard(String provider, String number) {
        this.provider = provider;
        this.number = number;
    }

    @Override
    public String toString() {
        return "СИМ-карта: " + provider + ", номер: " + number;
    }
}
