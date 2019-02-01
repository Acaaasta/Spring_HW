package ru.shooting;

public class Client {

    private String name;
    public Gun gun;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void shoot(){

        this.gun.shootingFromGun();

        System.out.println("Патроны кончились");
    }
}
