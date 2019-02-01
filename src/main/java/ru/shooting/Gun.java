package ru.shooting;

public class Gun {

    private Holder holder;

    public void shootingFromGun(){
        for (int i = 1; i <= this.holder.getCountHolders(); i++) {
            System.out.println("Клиент стреляет "+ i +" -й раз");
        }

    }

    public Holder getHolder() {
        return holder;
    }

    public void setHolder(Holder holder) {
        this.holder = holder;
    }
}
