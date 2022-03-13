package com.rizvi.spring.controllers;

import com.rizvi.spring.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @BeforeEach
    public void setUp() throws Exception {
       this.propertyInjectedController = new PropertyInjectedController();
       this.propertyInjectedController.greetingServiceImpl = new GreetingServiceImpl();
    }

    @Test
    void testGreeting() throws Exception {
        assertEquals(GreetingServiceImpl.HELLO_SYED, propertyInjectedController.sayHello());
    }
}