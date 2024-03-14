package VetClinic.Animals;

import java.time.LocalDate;

import VetClinic.Clients.Owner;


public  class Bird extends Animal implements Flyable{
    public Bird(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    @Override
    public void eat() {
        System.out.println("птичка клюет");
    }

    @Override
    public double fly() {
        return 7;
    }
    
} 
    

