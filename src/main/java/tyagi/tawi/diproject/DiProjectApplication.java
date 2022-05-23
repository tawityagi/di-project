package tyagi.tawi.diproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import tyagi.tawi.diproject.controllers.ConstructorInjectedController;
import tyagi.tawi.diproject.controllers.MyController;
import tyagi.tawi.diproject.controllers.PropertyInjectedController;
import tyagi.tawi.diproject.controllers.SetterInjectedController;

@SpringBootApplication
public class DiProjectApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiProjectApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();

		System.out.println(greeting);

		System.out.println("-- PROPERTY BASED -- ");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
	
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("-- SETTER BASED -- ");

		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
	
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("-- CONSTRUCTOR BASED -- ");

		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
	
		System.out.println(constructorInjectedController.getGreeting());

		
	}

}
