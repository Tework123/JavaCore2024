package Lessons20to30;

import Lessons20to30.Interfaces.Actions;

import java.util.ArrayList;
import java.util.List;


public class MainForAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal(2);
        Dog dog = new Dog(1);
        Animal animal2 = new Dog(3);
        animal2.eat();
        Dog dog2 = (Dog) animal2;
        dog2.bark();

        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Animal(100));
        listOfAnimals.add(new Animal(1000));

        test(listOfAnimals);
        Object object = new Animal(10);
        ((Animal) object).eat();


    }

    public static void test(List<? extends Animal> list) {
        for (Animal animal : list) {
            System.out.println(animal);
        }
    }
}
