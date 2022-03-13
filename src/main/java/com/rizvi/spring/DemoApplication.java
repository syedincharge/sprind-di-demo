package com.rizvi.spring;

import com.rizvi.spring.controllers.ConstructorInjectedController;
import com.rizvi.spring.controllers.MyController;
import com.rizvi.spring.controllers.PropertyInjectedController;
import com.rizvi.spring.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		 ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		 MyController controller = (MyController) ctx.getBean("myController");


		System.out.println(controller.hello());
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}

}
