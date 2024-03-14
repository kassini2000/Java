package VetClinic.Animals;

import java.time.LocalDate;
//абстрактный класс: нельзя сделать множественное наследование;
//класс хранит состояние и поведение; его нельзя создать через new;

import VetClinic.Clients.Owner;

public abstract class Animal {
    //поля класса
    protected String name; // состояние(поведение)
    protected float weight;
    protected LocalDate age;
    protected Owner owner;

    public Animal(String name, float weight, LocalDate age, Owner owner) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.owner = owner;
    }

    //вызов другого метода
    public Animal() {
        this("животное", 100, LocalDate.now(), new Owner());
    
    }

    //конструкторы(вызывается первым)
    /*private void sleep(){
        System.out.println(getType() + " sleep");
    }
    private void wakeUp(){
        System.out.println(getType() + " Wakeup");
    }*/
    public abstract void eat();

    /*private void play(){
        System.out.println(getType() + " Play");
    }
    public void toGo(){
        System.out.println(getType() + " Togo");
    }
    public void fly(){
        System.out.println(getType() + " Fly");
    }
    public void swim(){
        System.out.println(getType() + " Swim");
    }*/

    public String getType(){
        return getClass().getSimpleName();
    }

    //гетеры
    public String getName(){
        return name;
    }
    public float getWeight(){
        return weight;
    }
    public LocalDate getAge(){
        return age;
    }
    public Owner getOwner(){
        return owner;
    }

    //сетеры
    public void setWeight(float weight){
        this.weight = weight;
    }
    public void setOwner(Owner owner){
        this.owner = owner;
    }
    
    @Override
    public String toString() {

        return String.format("name = %s, weight = %s, age = %s, owner = %s", name, weight, age, owner);
    }
}
