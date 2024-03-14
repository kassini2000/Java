package VetClinic.Animals;

import java.time.LocalDate;

import VetClinic.Clients.Owner;


public class Duck extends Animal implements Flyable, Swimable{
    public Duck(String name, float weight, LocalDate age, Owner owner){
        super(name, weight, age, owner);
    }

    @Override
    public void eat() { 
    }

    @Override
    public double fly() {
       return 2;
    }

    @Override
    public void swim() {
        System.out.println("утка плавает");
    }
    
}
