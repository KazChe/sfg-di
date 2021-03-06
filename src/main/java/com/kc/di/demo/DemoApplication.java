package com.kc.di.demo;

import com.kc.di.demo.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

		System.out.println("--------- Profile");
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.getGreeting());


		System.out.println("------------  Primary Bean");
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println(myController.getString());

		System.out.println("------------ Property Injection");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("--------- Setter Injection");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("---------------- Constructor Inject!!");
		ContructorInjectedController contructorInjectedController = (ContructorInjectedController) ctx.getBean("contructorInjectedController");
		System.out.println(contructorInjectedController.getGreeting());
	}

}
