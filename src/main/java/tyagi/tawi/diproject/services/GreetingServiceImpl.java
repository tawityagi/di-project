package tyagi.tawi.diproject.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements ConstructorGreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
