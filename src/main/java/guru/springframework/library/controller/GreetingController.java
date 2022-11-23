package guru.springframework.library.controller;

import guru.springframework.library.service.greeting.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingController {
    private final GreetingService greetingService;

    public GreetingController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
