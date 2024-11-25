package Lessons1to10;

import java.util.Scanner;

public class Classes {
    public static void main(String[] args) {
        Person person1 = new Person();
        Scanner scanner = new Scanner(System.in);
        System.out.println("give me name");
        String name = scanner.nextLine();
        person1.setName(name);
        System.out.println(person1.getName());



    }

}

class Person {
    private String name;
    int age;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

}
