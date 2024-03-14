package VetClinic.Staff;

import VetClinic.Animals.Animal;

public interface Vaccinate {
    int numberOfVaccine();
    default String vaccinate(Workers workers, Animal animal){
        System.out.printf("%s %s проведена вакцинация %s %s%n", workers.getJob(), workers.getName(), animal.getType(), animal.getName());
        return null;
    }
}
