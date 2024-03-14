package VetClinic.Animals;

import java.time.LocalDate;

import VetClinic.Clients.Owner;

public class Lion extends Animal implements Goable{
    public Object wakeUp;

    //конструктор(метод)
   //public Lion() {
    public Lion(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Lion(){
        super();
    }

    @Override
    public void eat() {
        System.out.println("Котик ест");
    }

    @Override
    public double run() {
        return 5;
    }
   }

