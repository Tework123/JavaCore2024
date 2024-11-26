package Lessons20to30;

import Lessons20to30.Interfaces.Actions;

public class Animal implements Actions {

    public void showInfo() {
        System.out.println("Info for animal");
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public void sleep() {
        System.out.println("I am sleeping");
    }
}
