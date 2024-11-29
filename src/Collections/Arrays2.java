package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Arrays;

public class Arrays2 {

    public static void main(String[] args) {
        Human people1 = new Human("Masha", 15, 80);
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("b");

        StringBuilder[] stringBuilders = {sb1, sb2};
        List<StringBuilder> list = Arrays.asList(stringBuilders);
        System.out.println(list);
        sb1.append("dasd");
        System.out.println(list);



    }
}

class Human {
    private String name;
    private int age;
    private int weight;

    public Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Human human)) return false;
        return age == human.age && weight == human.weight && Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight);
    }
}









