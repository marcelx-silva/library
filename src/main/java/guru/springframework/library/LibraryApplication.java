package guru.springframework.library;

import guru.springframework.library.controller.MyController;
import guru.springframework.library.controller.greeting.GreetingEnglishController;
import guru.springframework.library.controller.greeting.GreetingGermanController;
import guru.springframework.library.controller.greeting.GreetingPolishController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LibraryApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(LibraryApplication.class, args);
        GreetingEnglishController greetingEnglishController = (GreetingEnglishController) context.getBean("greetingEnglishController");
        GreetingGermanController greetingGermanController = (GreetingGermanController) context.getBean("greetingGermanController");
        GreetingPolishController greetingPolishController = (GreetingPolishController) context.getBean("greetingPolishController");
        System.out.println("English Greeting: "+greetingEnglishController.getGreeting());
        System.out.println("Polish Greeting: "+greetingPolishController.getGreeting());
        System.out.println("German Greeting: "+greetingGermanController.getGreeting());
        System.out.println("-------------------------------------------------------");

        MyController myController = (MyController) context.getBean("myController");
        System.out.println(myController.sayHello());
    }

}
