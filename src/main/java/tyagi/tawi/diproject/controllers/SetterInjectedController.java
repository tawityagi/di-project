package tyagi.tawi.diproject.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import tyagi.tawi.diproject.services.ConstructorGreetingService;

@Component
public class SetterInjectedController {
    private ConstructorGreetingService greetingService;

    @Autowired
    public void setGreetingService(ConstructorGreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
