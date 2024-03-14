package VetClinic.Staff;


import VetClinic.Animals.Animal;

public class Nurse extends Workers implements Consult{
    public Nurse(String name, int age, int salary) {
        super(name,age, salary);
    }
    @Override
    public void toWork() {
    }
    public void Vaccinate(Animal animal){
        System.out.println(animal.getType() + " " + animal.getName());
    }
    public void help(){
        System.out.println("помогает доктору");
    }
    @Override
    public int numberConsultation() {
        return 10;
    }
    public void consult(Nurse nurse, Animal animals) {
       System.out.println("проводит консультацию");
    }
}
