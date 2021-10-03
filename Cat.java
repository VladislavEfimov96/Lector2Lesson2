package Lector2.lesson2;

public class Cat extends Animal{
    public Cat(String food, String location, boolean isKnowledge) {
        super(food, location);
        this.isKnowledge=isKnowledge;
        animalType="Кошка";
    }
    boolean isKnowledge;
}

