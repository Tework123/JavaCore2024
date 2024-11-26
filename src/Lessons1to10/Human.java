package Lessons1to10;

public class Human {
    public static void main(String[] args) {
        Human2 human2 = new Human2("Dima", 25);
        Human2 human3 = new Human2(25);
        Human2.weight = 70;
        System.out.println(Human2.getWeight());
        System.out.println(human3.x);


    }

}

class Human2 {
    private String name;
    private int age;
    public static int weight;
    public static final int x = 10;

    public Human2(String name, int age) {
        System.out.println("1 constructor");
        this.name = name;
        this.age = age;
    }

    public Human2(int age) {
        System.out.println("2 constructor");
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getWeight() {
        return weight;
    }
}
