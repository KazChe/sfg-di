package com.kc.di.demo.controller;

import com.kc.di.demo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ContructorInjectedController {

    private final GreetingService greetingService;

    // constructor injected - most referred way of injection
    public ContructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.greetings();
    }
}
