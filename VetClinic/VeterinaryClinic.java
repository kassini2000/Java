package VetClinic;

import java.util.ArrayList;
import java.util.List;

import VetClinic.Animals.Animal;
import VetClinic.Animals.Flyable;
import VetClinic.Animals.Goable;
import VetClinic.Animals.Swimable;
import VetClinic.Staff.Doctor;
import VetClinic.Staff.Nurse;

public class VeterinaryClinic {

    public static List<Animal> getRunAnimals(List<Animal> animals) {
        List<Animal> runAnimals = new ArrayList<>();
        for (Animal animal : runAnimals) {
            if (animal instanceof Goable) {
                runAnimals.add(animal);
            }
        }
        return runAnimals;
    }
    public static List<Animal> getFlyAnimals(List<Animal> animals) {
        List<Animal> flyAnimals = new ArrayList<>();
        for (Animal animal : flyAnimals) {
            if (animal instanceof Flyable) {
                flyAnimals.add(animal);
            }
        }
        return flyAnimals;
    }
    public static List<Animal> getSwimAnimals(List<Animal> animals) {
        List<Animal> swimAnimals = new ArrayList<>();
        for (Animal animal : swimAnimals) {
            if (animal instanceof Swimable) {
                swimAnimals.add(animal);
            }
        }
        return swimAnimals;
    }

    public static void doc(Doctor doctor, Animal animal) {
        System.out.printf("Направляет на анализы",
                doctor.getJob(), doctor.getName(), animal.getType(), animal.getName());
    }
    public static void nur(Nurse nurse, Animal animal) {
        System.out.printf("берет анализы",
                nurse.getJob(), nurse.getName(), animal.getType(), animal.getName());
    }
}