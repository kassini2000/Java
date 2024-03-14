package VetClinic.Staff;

import VetClinic.Animals.Animal;
import VetClinic.Clients.Owner;

public interface Consult {
    int numberConsultation();
    default String consult(Workers workers, Animal animal, Owner owner){
        System.out.printf("%s %s проведена консультация %s %s %s%n", workers.getJob(), workers.getName(), new Owner(), animal.getType(), animal.getName());
        return null;
    }
}