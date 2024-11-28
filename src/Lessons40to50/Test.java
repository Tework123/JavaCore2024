package Lessons40to50;

public class Test {
    public static void main(String[] args) {

        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);
        System.out.println(animal1 == animal2);
        System.out.println(animal1.equals(animal2));
        String x = "123";
        String y = "123";
        System.out.println(x.equals(y));
        Car car = new Car();
        car.start();
        AnimalEnum animal = AnimalEnum.CAT;
        System.out.println(animal);


    }
}

class Animal {
    private int id;

    public Animal(int id) {
        this.id = id;
    }

    public boolean equals(Object obj) {
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;
    }
}
