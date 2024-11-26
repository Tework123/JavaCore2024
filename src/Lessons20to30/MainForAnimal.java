package Lessons20to30;

import Lessons20to30.Interfaces.Actions;


public class MainForAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        Dog dog1 = new Dog();
        dog1.eat();
        animal.showInfo();
        dog1.showInfo();
        Actions info = new Animal();
        Actions info2 = new Dog();
        info.showInfo();
        info2.showInfo();
    }
}
