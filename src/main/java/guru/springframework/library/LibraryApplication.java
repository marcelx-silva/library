package guru.springframework.library;

import guru.springframework.library.controller.ConstructorInjectedController;
import guru.springframework.library.controller.MyController;
import guru.springframework.library.controller.PropertyInjectedController;
import guru.springframework.library.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class LibraryApplication {

    public static void main(String[] args) {
     ApplicationContext context = SpringApplication.run(LibraryApplication.class, args);

        MyController myController = (MyController) context.getBean("myController");
        System.out.println(context.getBean("myController").getClass());
        System.out.println(context.getBean("myController"));
        String greeting =  myController.sayHello();
        System.out.println(greeting);

        System.out.println("--------------------------");
        System.out.println("Tipos de Injecao de dependecia");

        System.out.println("Via Propriedade:");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) context.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("Via Setter:");
        SetterInjectedController setterInjectedController = (SetterInjectedController) context.getBean("setterInjectedController");
        System.out.println(setterInjectedController.getGreeting());

        System.out.println("Via Construtor:" );
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) context.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreeting());
    }

}
