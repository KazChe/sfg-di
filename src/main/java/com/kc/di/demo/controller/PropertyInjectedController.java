package com.kc.di.demo.controller;

import com.kc.di.demo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    // injected property - least accepted method of injection
    @Autowired
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.greetings();
    }
}
