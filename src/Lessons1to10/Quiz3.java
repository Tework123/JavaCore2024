package Lessons1to10;

import java.util.Arrays;
import java.util.Collections;

public class Quiz3 {
    public static void main(String[] args) {
//        1 quiz
//        System.out.println(maskify("4556364607935616"));\
//
//        2 quiz
//        long[] nums = {19, 25, 77, 5, 2};
//        System.out.println(sumTwoSmallestNumbers(nums));

//        3 quiz
//        int[] numbers = {4,2,3};
//        int target = 6;
//        System.out.println(twoSum(numbers, target)[0]);
//        System.out.println(twoSum(numbers, target)[1]);
//        4 quiz
        System.out.println(encode("Prespecialized"));
        System.out.println(encode("(( @"));


    }


//    public static String maskify(String str) {
//        StringBuilder resultStr = new StringBuilder(str);
//
//        for (int i = resultStr.length() - 1; i >= 0; i--) {
//
//
//            if ((resultStr.length() - i > 4) && (resultStr.length() > 4)) {
//                resultStr.setCharAt(i, '#');
//            }
//        }
//        return resultStr.toString();
//    }

//    public static long sumTwoSmallestNumbers(long[] numbers) {
//        Arrays.sort(numbers);
//        if (numbers.length <= 2) {
//            return Arrays.stream(numbers).sum();
//        } else {
//            return numbers[0] + numbers[1];
//        }
//
//    }

//    public static int[] twoSum(int[] numbers, int target) {
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = 0; j < numbers.length; j++) {
//                if ((numbers[i] + numbers[j] == target) && i != j) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return new int[]{1};
//    }

    static String encode(String word){
        word = word.toLowerCase();
        String result = "";
        for (int i = 0; i < word.length(); ++i) {
            char c = word.charAt(i);
            result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
        }
        return result;
    }
}


