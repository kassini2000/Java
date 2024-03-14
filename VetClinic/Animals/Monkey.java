package VetClinic.Animals;

import java.time.LocalDate;

import VetClinic.Clients.Owner;

public class Monkey extends Animal implements Goable{
    public Monkey(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("обезьяна ест");
    }

    @Override
    public double run() {
        return 3;
    }
}
