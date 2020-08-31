package com.kc.di.demo.controller;

import com.kc.di.demo.services.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;

    // sett injected  - better then property injected
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.greetings();
    }
}
