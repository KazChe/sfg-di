package com.kc.di.demo.controller;

import com.kc.di.demo.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContructorInjectedControllerTest {

   ContructorInjectedController contructorInjectedController;


    @BeforeEach
    void setUp() {
        contructorInjectedController = new ContructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(contructorInjectedController.getGreeting());
    }
}