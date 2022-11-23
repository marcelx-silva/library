package guru.springframework.library.service.greeting;

public class GreetingServiceGerman implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Hallo, wie geht's dir?";
    }
}
