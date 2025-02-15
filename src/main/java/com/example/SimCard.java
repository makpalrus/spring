package com.example;

import org.springframework.stereotype.Component;

@Component
public class SimCard {
    private String number="+7 777 398 0496";
    public String getNumber() {
        return number;
    }
}
