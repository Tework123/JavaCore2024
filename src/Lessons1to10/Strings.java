package Lessons1to10;

import javax.swing.text.Style;

public class Strings {
    public static void main(String[] args) {
        String string1 = "hello";
        String string2 = "me3";
        String string3 = "friend";
        // create 2 extra string objects
//        String all = string1+string2+string3;
//        System.out.println(all);
//        change string11 (do not create new objects)
        StringBuilder string11 = new StringBuilder("hello");
        StringBuilder string22 = new StringBuilder("me3");
        StringBuilder string33 = new StringBuilder("friend");
        System.out.println(string11.toString());
        string11.append(string22).append(string33);
        System.out.println(string11);
    }
}
