package ru.shooting;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();
        Gun gun = new Gun();
        Holder holder = new Holder();
        holder.setCountHolders(20);
        gun.setHolder(holder);
        client.gun=gun;
        client.shoot();
    }
}
