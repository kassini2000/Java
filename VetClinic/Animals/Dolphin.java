package VetClinic.Animals;

import java.time.LocalDate;

import VetClinic.Clients.Owner;



public class Dolphin extends Animal implements Swimable{
    public Dolphin(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("дельфин ест");
    }

    @Override
    public void swim() {
        System.out.println("дельфин очень быстро плавает");
    }
}
