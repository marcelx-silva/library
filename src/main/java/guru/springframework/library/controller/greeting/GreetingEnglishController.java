package guru.springframework.library.controller.greeting;

import guru.springframework.library.service.greeting.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingEnglishController {
    private final GreetingService greetingService;

    public GreetingEnglishController(@Qualifier("greetingServiceEnglish") GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
