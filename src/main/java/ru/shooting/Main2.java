package ru.shooting;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main2 {

    public static void main(String[] args) {
        Client client = new Client();

        final ApplicationContext context = new ClassPathXmlApplicationContext("appl.xml");
        final Holder holder = context.getBean("holder", Holder.class);
        final Gun gun = context.getBean("gun", Gun.class);
//        Gun gun = new Gun();
//        Holder holder = new Holder();
//        holder.countHolders=20;
//        gun.setHolder(holder);
        client.gun=gun;
        client.shoot();
    }
}
