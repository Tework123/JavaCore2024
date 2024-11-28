package Lessons40to50;

import java.io.Serializable;

public class Person implements Serializable {
    private int age;
    private transient String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
