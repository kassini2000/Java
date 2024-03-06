import java.time.LocalDate;
import clients.Bird;
import clients.Dog;
import clients.Dolphin;
import clients.Horse;
import clients.Lion;
import clients.Monkey;
import clients.Owner;
import clients.Squirrel;
import clients.Whale;

public class Main {
    public static void main(String[] args) {
        // (экземпляр класса)
         Lion leva = new Lion("leva", 200, LocalDate.now(), new Owner());
         Lion puzzo = new Lion("cat", 45, LocalDate.now(), new Owner());

         Dog pes = new Dog("frend", 20, LocalDate.now(), new Owner());
         Bird ara = new Bird("ara", 1, LocalDate.now(), new Owner());
         Squirrel scrattie = new Squirrel("scrattie", 1, LocalDate.now(), new Owner());
         Dolphin cody = new Dolphin("cody", 150, LocalDate.now(), new Owner());
         Whale mobi = new Whale("mobi", 1000, LocalDate.now(), new Owner());
         Horse busy = new Horse("busy", 500, LocalDate.now(), new Owner());
         Monkey stiv = new Monkey("stiv", 50, LocalDate.now(), new Owner());
        

        //полиморфизм
        /*List<Animal> animals = new ArrayList<>();
         animals.add(puzzo);
         animals.add(leva);
         animals.add(pes);
         System.out.println(animals);*/

         //System.out.println(ara.getType();

        busy.wolk();
        stiv.wolk();
        ara.flying();
        scrattie.flying();
        cody.sailing();
        mobi.sailing();


        // System.out.println(leva.getAge());
        // System.err.println(test);
        // System.out.println(puzzo);
        // System.out.println(puzzo.getType());
        // System.out.println(leva.getWeight());
        // leva.setWeight(250);
        // System.out.println(leva.getWeight());

        //puzzo.live();
         
    }
}