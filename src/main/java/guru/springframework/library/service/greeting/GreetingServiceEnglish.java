package guru.springframework.library.service.greeting;

import guru.springframework.library.service.greeting.GreetingService;
import org.springframework.stereotype.Service;

@Service
public class GreetingServiceEnglish implements GreetingService {
    public String sayGreeting() {
        return "Hello, how are you?";
    }
}
