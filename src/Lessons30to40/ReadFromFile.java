package Lessons30to40;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {
        String separator = File.separator;
//        File file = new File(separator + "home"
//                + separator + "t1" + separator
//                + "JavaProjects" + separator
//                + "JavaCore2024" + separator+ "text.txt");

        File file = new File("text.txt");
        System.out.println(file);

        Scanner scanner = null;
        try {
            scanner = new Scanner(file);


        } catch (FileNotFoundException e) {
            System.out.println("HELELLELELELL");
            e.printStackTrace();
        }
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
        throw new IOException("BAD PROBLEM");


    }
}
