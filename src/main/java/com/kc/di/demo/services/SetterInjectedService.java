package com.kc.di.demo.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedService implements GreetingService {
    @Override
    public String greetings() {
        return "Whatup? - Injected For Setter";
    }
}
