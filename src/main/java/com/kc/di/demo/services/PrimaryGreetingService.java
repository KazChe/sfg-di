package com.kc.di.demo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService{
    @Override
    public String greetings() {
        return "Hello from @Primary Bean";
    }
}
