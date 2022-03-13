package com.rizvi.spring.controllers;

import com.rizvi.spring.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    public void setUp() throws Exception {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    public void  testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_SYED, constructorInjectedController.sayHello());
    }
}