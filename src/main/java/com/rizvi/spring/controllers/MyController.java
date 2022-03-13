package com.rizvi.spring.controllers;

import com.rizvi.spring.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello !!!!!!! From System println");
        return greetingService.sayGreeting();
    }
}
