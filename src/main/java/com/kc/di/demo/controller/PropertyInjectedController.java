package com.kc.di.demo.controller;

import com.kc.di.demo.services.GreetingService;

public class PropertyInjectedController {

    // injected property - least accepted method of injection
    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.greetings();
    }
}
