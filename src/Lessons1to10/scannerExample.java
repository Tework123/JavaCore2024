package Lessons1to10;

import java.util.Scanner;

public class scannerExample {
    public static void main(String[] args) {
        String s = new String("fasd");
        Scanner sc = new Scanner(System.in);
        System.out.println("write something");
        String str = sc.nextLine();
        System.out.println(str);
    }
}
