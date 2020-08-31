package com.kc.di.demo;

import com.kc.di.demo.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");
//		String greeting = myController.getString();
		System.out.println(myController.getString());
	}

}
