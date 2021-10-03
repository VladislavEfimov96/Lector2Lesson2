package Lector2.lesson2;

public class lesson2 {
    public static void main(String[] args){
        Animal animal1=new Animal("Пища","Россия");
        System.out.println(animal1.makeNoise());
        System.out.println(animal1.eat());
        System.out.println(animal1.sleep());
        System.out.println();
        Dog animal2=new Dog("Корм","Россия", true);
        System.out.println(animal2.makeNoise());
        System.out.println(animal2.eat());
        System.out.println(animal2.sleep());
        System.out.println(animal2.unSleep());
        System.out.println("Собака дисциплинирована?:" + animal2.Commands);
        System.out.println();
        Cat animal3=new Cat("Корм","Россия", false);
        System.out.println(animal3.makeNoise());
        System.out.println(animal3.eat());
        System.out.println(animal3.sleep());
        System.out.println("Кошка дисциплинирована?:" + animal3.isKnowledge);
        System.out.println();

        Horse animal4=new Horse("Сено","Россия", "Редкая");
        System.out.println(animal4.makeNoise());
        System.out.println(animal4.eat());
        System.out.println(animal4.sleep());
        System.out.println("Порода лошади:" + animal4.poroda);
        System.out.println();
        Animal[] animals = {animal1, animal2, animal3, animal4};
        Veterinar.treatAnimal(animals);
    }
}
