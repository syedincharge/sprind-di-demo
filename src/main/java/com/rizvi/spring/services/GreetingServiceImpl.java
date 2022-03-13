package com.rizvi.spring.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

    public static final String HELLO_SYED = "Hello Syed !!! - Original from Service Impl";

    @Override
    public String sayGreeting() {
     return HELLO_SYED;
    }
}
