package VetClinic.Animals;
@FunctionalInterface

//интерфейс описывает только поведение, его не создают через new;
//можно множественно наследовать;
public interface Swimable {
    double pi = 3.1415;
    void swim();

    default void sound(){
        System.out.println("я дефолтный метод");
    }
}
