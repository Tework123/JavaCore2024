package Collections2;

import java.util.Objects;

public class Lambda2 {
    public static void main(String[] args) throws Exception {
        Human human = new Human("Masha", 25);
        System.out.println(human.checkAge(15));

        HumanInt checkAge2 = (n) -> {
            return n >= 18;
        };
        System.out.println(checkAge2.run(1));
        System.out.println(checkAge2.run(20));

    }
}


class Human {
    int age;
    String name;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean checkAge(int n) {
        return n >= 18;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Human human)) return false;
        return age == human.age && Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "Human{" + "age=" + age + ", name='" + name + '\'' + '}';
    }
}
