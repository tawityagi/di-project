package tyagi.tawi.diproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import tyagi.tawi.diproject.controllers.ConstructorInjectedController;
import tyagi.tawi.diproject.controllers.I18nController;
import tyagi.tawi.diproject.controllers.MyController;
import tyagi.tawi.diproject.controllers.PropertyInjectedController;
import tyagi.tawi.diproject.controllers.SetterInjectedController;

@SpringBootApplication
public class DiProjectApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiProjectApplication.class, args);

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		
		System.out.println(i18nController.sayHello());
		
		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("-- PRIMARY Bean");
		System.out.println(myController.sayHello());

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
