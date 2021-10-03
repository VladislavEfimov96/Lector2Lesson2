package Lector2.lesson2;

public class Dog extends Animal{
    public Dog(String food, String location, boolean Commands) {
        super(food, location);
        this.Commands = Commands;
        animalType="Собака";
    }
    boolean Commands;
}
