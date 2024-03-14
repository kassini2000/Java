import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import VetClinic.VeterinaryClinic;
import VetClinic.Animals.Animal;
import VetClinic.Animals.Bird;
import VetClinic.Animals.Dog;
import VetClinic.Animals.Dolphin;
import VetClinic.Animals.Duck;
import VetClinic.Animals.Goable;
import VetClinic.Animals.Horse;
import VetClinic.Animals.Lion;
import VetClinic.Animals.Monkey;
import VetClinic.Animals.Swimable;
import VetClinic.Clients.Owner;
import VetClinic.Staff.Doctor;
import VetClinic.Staff.Nurse;


public class Main {
    public static void main(String[] args) {
        /*Animal dog = new Dog("Fill", 7, LocalDate.now(), new Owner());
        Swimable dolphin = new Dolphin("Fish", 1, LocalDate.now(), new Owner());
        dolphin.sound();
        List<Animal> flyables = new ArrayList<>();
        flyables.add(new Duck("cra", 1,LocalDate.now(), new Owner()));
        flyables.add(new Dolphin("Fish", 1, LocalDate.now(), new Owner()));
        for (Animal animal: flyables){
            if (animal instanceof Flyable){
               ((Flyable)animal).fly(); //трансформация((канстонация) одного класса в другой
            }
        }
    }*/
        
        // (экземпляр класса)
         /*Lion leva = new Lion("leva", 200, LocalDate.now(), new Owner());
         Lion puzzo = new Lion("cat", 45, LocalDate.now(), new Owner());

         Dog pes = new Dog("frend", 20, LocalDate.now(), new Owner());
         Bird ara = new Bird("ara", 1, LocalDate.now(), new Owner());
         Dolphin cody = new Dolphin("cody", 150, LocalDate.now(), new Owner());
         Horse busy = new Horse("busy", 500, LocalDate.now(), new Owner());
         Monkey stiv = new Monkey("stiv", 50, LocalDate.now(), new Owner());
        

        //полиморфизм
        /*List<Animal> animals = new ArrayList<>();*/

        Lion lion = new Lion("Лева", 300, LocalDate.now(), new Owner());
        Horse horse = new Horse("ВИП", 500, LocalDate.now(), new Owner());
        Duck duck = new Duck("Кря", 0.5f,LocalDate.now(), new Owner());
        Monkey monkey = new Monkey("Бату", 3,LocalDate.now(), new Owner());
        Dolphin dolphin = new Dolphin("Банни", 200,LocalDate.now(), new Owner());
        Bird bird = new Bird("Ара", 0.5f,LocalDate.now(), new Owner());
        Dog dog = new Dog("Муха", 5,LocalDate.now(), new Owner());
      
        List<Animal> animals = new ArrayList<>(List.of(dog, duck, monkey, lion, horse, bird));
        List<Animal> runningAnimals = VeterinaryClinic.getFlyAnimals(animals);
        List<Animal> flyingAnimals = VeterinaryClinic.getFlyAnimals(animals);
        List<Animal> swimmingAnimals = VeterinaryClinic.getFlyAnimals(animals);
        System.out.println(runningAnimals);
        System.out.println(flyingAnimals);
        System.out.println(swimmingAnimals);
    }
}