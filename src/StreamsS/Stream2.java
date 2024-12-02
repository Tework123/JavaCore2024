package StreamsS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream2 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(11);
        list1.add(100);
        list1.add(140);
        int[] array2 = {1, 8, 123};
        List<Integer> listResult = list1.stream().filter(x -> x > 19).map(x -> x * 2).collect(Collectors.toList());
//        System.out.println(listResult);
//        long x = list1.stream().findFirst().stream().findFirst().get();
//        System.out.println(x);
//        int sum = Arrays.stream(array2).sum();
//        System.out.println(sum);


        final List<String> list = List.of("one", "two", "three");

        List<Boolean> list3 = list.stream().map(x -> {
            System.out.println("yes");
            return x.length() > 3;
        }).toList().stream().sorted().toList();
        System.out.println(list3);

//        list.stream()
//                .filter(s -> {
//                    System.out.println("filter: " + s);
//                    return s.length() <= 3;
//                })
//                .map(s1 -> {
//                    System.out.println("map: " + s1);
//                    return s1.toUpperCase();
//                })
//                .sorted()
//                .forEach(x -> {
//                    System.out.println("forEach: " + x);
//                });

//        list.stream()
//                .filter(s -> {
//                    System.out.println("filter: " + s);
//                    return s.length() <= 3;
//                })
//                .map(s1 -> {
//                    System.out.println("map: " + s1);
//                    return s1.toUpperCase();
//                })
//                .forEach(x -> {
//                    System.out.println("forEach: " + x);
//                });
    }
}
