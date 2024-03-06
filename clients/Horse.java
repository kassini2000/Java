package clients;

import java.time.LocalDate;

public class Horse extends Animal{
    public Horse(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
}
