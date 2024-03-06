package clients;

import java.time.LocalDate;

public class Animal {
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
    private void sleep(){
        System.out.println(getType() + " sleep");
    }
    private void wakeUp(){
        System.out.println(getType() + " Wakeup");
    }
    private void eat(){
        System.out.println(getType() + " Eat");
    }
    private void play(){
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
    }

    public void live() {
        wakeUp();
        eat();
        play();
        sleep();
    }
    public void wolk(){
        live();
        toGo();
    }
    public void flying(){
        live();
        fly(); 
    }
    public void sailing(){
        live();
        swim();
    }

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
