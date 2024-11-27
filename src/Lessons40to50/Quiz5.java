package Lessons40to50;

import java.util.Arrays;
import java.util.List;

public class Quiz5 {
    public static void main(String[] args) {
//        String morseStr = "···· · −·−−   ·−−− ··− −·· ·";
//        morse(morseStr);
//        System.out.println(Arrays.toString(tribonacci(new double[]{1, 1}, 1)));
        System.out.println(Arrays.toString(tribonacci(new double[]{0.5,
                1.5,
                2.5}, 10)));

    }

//    public static void morse(String morseStr) {
//        StringBuilder result = new StringBuilder();
//        String[] x = morseStr.split(" {3}");
//        for (String element : x) {
//            String[] x2 = element.split(" ");
//            for (String element2 : x2) {
//                result.append(element2);
//            }
//            result.append(" ");
//        }
//        System.out.println(result.toString());
//    }

    public static double[] tribonacci(double[] s, int n) {
        if (n == 0) {
            return new double[]{};
        }
        if (n == 1) {
            return new double[]{s[0]};
        }
        if (n == 2) {
            return new double[]{s[1]};
        }
        List<Double> list = new java.util.ArrayList<>(Arrays.stream(s).boxed().toList());

        for (int i = 2; i < n - 1; i++) {
            double sum = list.get(i - 2) + list.get(i - 1) + list.get(i);
            list.add(sum);
            System.out.println(list.get(i));
        }
        double[] result = list.stream().mapToDouble(Double::doubleValue).toArray();

        return result;
    }
}
