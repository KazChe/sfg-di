package com.kc.di.demo.controller;

import com.kc.di.demo.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContructorInjectedControllerTest {

   ContructorInjectedController contructorInjectedController;


    @BeforeEach
    void setUp() {
        contructorInjectedController = new ContructorInjectedController(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(contructorInjectedController.getGreeting());
    }
}