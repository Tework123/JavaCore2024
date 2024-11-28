package Lessons40to50;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("text.txt");
        PrintWriter pw = new PrintWriter(file);
        pw.println("hekkekekkekekekk");
        pw.println("hekkekekkekekekk2");
        pw.close();

    }
}
