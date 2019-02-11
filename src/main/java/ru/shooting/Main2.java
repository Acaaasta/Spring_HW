package ru.shooting;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {

    public static void main(String[] args) {
        Client client = new Client();

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appl.xml");
        Holder holder = context.getBean("holderG", Holder.class);
        Gun gun = context.getBean("gun", Gun.class);
        client.gun=gun;
        client.shoot();

        context.close();
        
    }
}
