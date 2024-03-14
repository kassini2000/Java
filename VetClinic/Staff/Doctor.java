package VetClinic.Staff;

import VetClinic.Animals.Animal;

public class Doctor extends Workers implements Vaccinate{
    public Doctor(String name, int age, int salary) {
      super(name, age, salary);
   }

   private String name;

   public String getName(){
       return name;
   }

   @Override
   public void toWork() {
      System.out.println("доктор работает в клинике");
   } 

   public void heals(Animal animal){
      System.out.println("Doctor healed " + animal.getType() + " " + animal.getName());
    }

   @Override
   public int numberOfVaccine() {
      return 7;
   }

   public void consult() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'consult'");
   }
}



