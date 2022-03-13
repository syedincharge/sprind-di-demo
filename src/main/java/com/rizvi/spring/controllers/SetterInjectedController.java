package com.rizvi.spring.controllers;

import com.rizvi.spring.services.GreetingService;
import com.rizvi.spring.services.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {


    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
    @Autowired
    @Qualifier("setterGreetingService")
    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }
}
