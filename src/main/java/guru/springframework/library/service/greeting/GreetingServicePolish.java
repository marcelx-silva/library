package guru.springframework.library.service.greeting;

import org.springframework.stereotype.Service;

@Service
public class GreetingServicePolish implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Witam, jak się masz?";
    }
}
