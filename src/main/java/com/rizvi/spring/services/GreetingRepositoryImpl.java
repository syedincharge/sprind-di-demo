package com.rizvi.spring.services;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository {

    @Override
    public String getEnglishGreeting() {
        return "Hello - English Greeting Service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Hello - Servicio de saludo Premario";
    }

    @Override
    public String getGermanGreeting() {
        return "Hello -  Primarer Grudddienst";
    }
}
