package Lessons40to50;

import java.io.*;

public class PersonIn {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person(18, "Masha");
        Person person2 = new Person(25, "Dima");

        FileOutputStream fos = new FileOutputStream("person.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(person);
        oos.writeObject(person2);
        oos.close();

        FileInputStream fis = new FileInputStream("person.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Person person11 = (Person) ois.readObject();
        Person person22 = (Person) ois.readObject();

        System.out.println(person11);
        System.out.println(person22);

    }
}
