package com.kc.di.demo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String greetings() {
        return "Whatup?";
    }
}
