package Lessons40to50;

import java.util.Arrays;

public class Quiz6 {
    public static void main(String[] args) {
//        System.out.println(toCamelCase("the-stealth-warrior"));
//        System.out.println(rot13("mm"));
        System.out.println(firstNonRepeatingLetter("sTress"));
    }


//    static String toCamelCase(String s) {
//        StringBuilder str = new StringBuilder(s);
//        for (int i = 0; i < str.length() - 1; i++) {
//            System.out.println(str.charAt(i));
//            if (str.charAt(i) == '-' || str.charAt(i) == '_') {
//                str.setCharAt(i + 1, Character.toUpperCase(str.charAt(i + 1)));
//                str.delete(i, i + 1);
//            }
//        }
//        str.setCharAt(0, Character.toUpperCase(str.charAt(0)));
//        return str.toString();
//    }

//    public static String rot13(String str) {
//        StringBuilder result = new StringBuilder();
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            int newInt = (int) ch;
//
//            if ((int) ch <= 90 && (int) ch >= 65) {
//                newInt = newInt + 13;
//
//                if (newInt > 90) {
//                    newInt = newInt - 26;
//                }
//            }
//            if ((int) ch <= 122 && (int) ch >= 97) {
//                newInt = newInt + 13;
//
//                if (newInt > 122) {
//                    newInt = newInt - 26;
//                }
//            }
//            result.append((char) newInt);
//
//        }
//        return result.toString();
//    }

    public static String firstNonRepeatingLetter(String s) {
        String lowerStr = s.toLowerCase();
        for (int i = 0; i < lowerStr.length(); i++) {
            char ch = lowerStr.charAt(i);
            if (lowerStr.indexOf(ch) == lowerStr.lastIndexOf(ch)) {
                return s.charAt(i) + "";
            }
        }
        return "";
    }

}
