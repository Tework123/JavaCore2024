package Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// compare object 1. with hashcode then 2. with equals. Base hashcode is address in memory;
// working like == what why you need override them methods when you compare classes;
public class HashMapEx {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(100, "hello");
        map1.put(101, "hello2");
        map1.putIfAbsent(102, "hello3 ");
        System.out.println(map1.get(100));
    }
}


class Car2 implements Comparable<Car2> {
    private int power;
    private String name;

    public Car2(int power, String name) {
        this.power = power;
        this.name = name;
    }

    @Override
    public int compareTo(Car2 o) {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Car2 car2)) return false;
        return power == car2.power && Objects.equals(name, car2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(power, name);
    }

    @Override
    public String toString() {
        return "Car2{" +
                "power=" + power +
                ", name='" + name + '\'' +
                '}';
    }
}

