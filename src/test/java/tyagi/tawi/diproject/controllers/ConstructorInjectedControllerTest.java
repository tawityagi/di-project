package tyagi.tawi.diproject.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tyagi.tawi.diproject.services.GreetingServiceImpl;

public class ConstructorInjectedControllerTest {
    ConstructorInjectedController controller;

    @BeforeEach
    void setUp(){
        controller = new ConstructorInjectedController(new GreetingServiceImpl());

    }
    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());

    }
}
