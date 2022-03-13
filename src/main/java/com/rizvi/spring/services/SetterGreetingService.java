package com.rizvi.spring.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - I was Injected by the Setter Base Injection !";
    }
}
