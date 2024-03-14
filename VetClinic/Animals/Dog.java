package VetClinic.Animals;

import java.time.LocalDate;

import VetClinic.Clients.Owner;

public class Dog extends Animal implements Goable, Swimable{
    public Dog(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("собачка ест");
    }

    @Override
    public void swim() {
        System.out.println("Собачка хорошо плавает");
    }

    @Override
    public double run() {
        return 3;
    }
    
}
