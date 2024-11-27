package Lessons20to30.Interfaces;

import Lessons20to30.Animal;

public class Main2ForAnimal {
    public static void main(String[] args) {
        OtherAnimal animal = new OtherAnimal();
        animal.eat();

        Animal animal1 = new Animal(1) {
          public void eat(){
              System.out.println("i am eeet");
          }
        };
        animal1.eat();
    }
}

class OtherAnimal extends Animal {

    public void eat() {
        System.out.println("I am eating2");
    }
}
