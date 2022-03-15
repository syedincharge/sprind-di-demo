package com.rizvi.spring;

import com.rizvi.spring.controllers.ConstructorInjectedController;
import com.rizvi.spring.controllers.MyController;
import com.rizvi.spring.controllers.PropertyInjectedController;
import com.rizvi.spring.controllers.SetterInjectedController;
import com.rizvi.spring.examplebeans.FakeDataSource;
import com.rizvi.spring.examplebeans.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;


//@ComponentScan(basePackages = {"com/rizvi/spring/services","com.rizvi.spring.controllers"})
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		 ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		 MyController controller = (MyController) ctx.getBean("myController");

		FakeDataSource fakeDatSource = (FakeDataSource) ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDatSource.getUser());

		FakeJmsBroker fakeJmsBroker = (FakeJmsBroker) ctx.getBean(FakeJmsBroker.class);
		System.out.println(fakeJmsBroker.getUsername());

	}

}
