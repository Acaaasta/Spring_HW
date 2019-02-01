package ru.Animals;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Dog")
public class Dog {

    @Value("Полкан")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
