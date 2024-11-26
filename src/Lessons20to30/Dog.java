package Lessons20to30;

import Lessons20to30.Interfaces.Actions;

public class Dog extends Animal implements Actions {
    public void bark() {
        System.out.println("I am barking");
    }
}
