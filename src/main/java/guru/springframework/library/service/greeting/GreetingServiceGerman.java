package guru.springframework.library.service.greeting;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceGerman implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hallo, wie geht's dir?";
    }
}
