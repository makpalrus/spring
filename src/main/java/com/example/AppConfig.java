package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example")
public class AppConfig {
    @Bean
    public Phone phone(SimCard simCard, Owner owner) {
        return new Phone("Iphone 13", simCard, owner);
    }

    @Bean
    public SimCard simCard() {
        return new SimCard("Beeline", "+7 777 398 0496");
    }

    @Bean
    public Owner owner() {
        return new Owner("Makpal", 18);
    }
}
