package com.kc.di.demo.controller;

import com.kc.di.demo.services.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController (GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getString() {
        return greetingService.greetings();
    }
}
