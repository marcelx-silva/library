package guru.springframework.library.service.greeting;

public class GreetingServicePolish implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Witam, jak się masz?";
    }
}
