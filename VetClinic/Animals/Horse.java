package VetClinic.Animals;

import java.time.LocalDate;

import VetClinic.Clients.Owner;

public class Horse extends Animal implements Goable{
    public Horse(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("лошадь ест");
    }

    @Override
    public double run() {
        return 15;
    }
}
