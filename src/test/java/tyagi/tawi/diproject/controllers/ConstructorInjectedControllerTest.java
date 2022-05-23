package tyagi.tawi.diproject.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tyagi.tawi.diproject.services.ConstructorGreetingServiceImpl;

public class ConstructorInjectedControllerTest {
    ConstructorInjectedController controller;

    @BeforeEach
    void setUp(){
        controller = new ConstructorInjectedController(new ConstructorGreetingServiceImpl());

    }
    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());

    }
}
