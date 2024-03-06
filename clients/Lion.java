package clients;

import java.time.LocalDate;

public class Lion extends Animal{
    public Object wakeUp;

    //конструктор(метод)
   //public Lion() {
    public Lion(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Lion(){
        super();
    }
   }

