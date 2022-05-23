package tyagi.tawi.diproject.controllers;

import org.springframework.stereotype.Controller;

import tyagi.tawi.diproject.services.GreetingService;

@Controller
public class MyController {

    private final GreetingService greetingService;

    MyController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
