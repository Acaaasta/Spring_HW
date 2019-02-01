package ru;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.Animals.Cat;
import ru.Animals.Dog;
import ru.config.ApplicationConfig;

public class MainClass {

    public static void main(String[] args) {

        final ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        final Cat cat = context.getBean(Cat.class);
        final Dog dog = context.getBean(Dog.class);
        System.out.println(cat);
        System.out.println(dog);


    }
}
