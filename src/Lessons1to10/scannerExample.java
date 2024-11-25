package Lessons1to10;

import java.util.Scanner;

public class scannerExample {
    public static void main(String[] args) {
//        String s = new String("fasd");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("write something");
//        String str = sc.nextLine();
//        System.out.println(str);

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        switch (age) {
            case 0:
                System.out.println("You born");
                break;
            case 7:
                System.out.println(" You tresh");
                break;
            default:
                System.out.println("NO");
        }
    }
}
