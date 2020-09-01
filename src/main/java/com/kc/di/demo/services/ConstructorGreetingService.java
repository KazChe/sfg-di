package com.kc.di.demo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String greetings() {
        return "Whatup? - Injected For Constructor";
    }
}
