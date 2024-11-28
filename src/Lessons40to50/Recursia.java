package Lessons40to50;

import java.util.ArrayList;
import java.util.List;

public class Recursia {
    public static void main(String[] args) {
//        List<Integer> result = new ArrayList<>();
//        System.out.println(reinsuresMethod(1, 15, result));
        recursion2(189);


    }

    //    public static List<Integer> reinsuresMethod(int a, int b, List<Integer> result) {
//        result.add(a);
//        if (a == b) {
//
//            return result;
//        }
//
//        System.out.println(a);
//
//
//        return reinsuresMethod(a + 1, b, result);
//    }
    public static void recursion2(int x) {
        if (x == 0) {
            return;
        }
        int x2 = x % 10;
        x = x / 10;
        System.out.println(x2);
        recursion2(x);

    }
}
