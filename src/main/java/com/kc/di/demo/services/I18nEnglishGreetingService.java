package com.kc.di.demo.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingService {


    @Override
    public String greetings() {
        return "Hello World - EN";
    }
}
