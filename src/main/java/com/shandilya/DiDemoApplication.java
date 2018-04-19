package com.shandilya;

import com.shandilya.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DiDemoApplication.class, args);
		MyController controller = (MyController)context.getBean("myController");
		controller.sayHi();

		System.out.println(context.getBean(ConstructorInjectedController.class).sayHi());
		System.out.println(context.getBean(PropertyInjectedController.class).sayHi());
		System.out.println(context.getBean(SetterInjectedController.class).sayHi());

		System.out.println(context.getBean(QualifierDemoController.class).greet());


	}
}