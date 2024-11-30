package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorJ {
    public static void main(String[] args) {
        Car car1 = new Car(423, "mazda");
        Car car2 = new Car(321, "jeep");
        ArrayList<Car> listCars = new ArrayList<>();
        listCars.add(car1);
        listCars.add(car2);
        Collections.sort(listCars);
        System.out.println(listCars);
        listCars.get(1);


    }
}

class Car implements Comparable<Car> {
    private int power;
    private String name;

    public Car(int power, String name) {
        this.power = power;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "power=" + power +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Car car) {
        if (car.power > this.power) {
            return car.power;
        }
        return this.power;
    }
}
