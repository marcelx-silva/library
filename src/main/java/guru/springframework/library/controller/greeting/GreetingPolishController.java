package guru.springframework.library.controller.greeting;

import guru.springframework.library.service.greeting.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingPolishController {
    private final GreetingService greetingService;

    public GreetingPolishController(@Qualifier("greetingServicePolish") GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return this.greetingService.sayGreeting();
    }
}
