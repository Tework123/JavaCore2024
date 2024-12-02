package StreamsS;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream1 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        for (int i = 5; i < 15; i++) {
            list1.add(String.valueOf(i));
        }
        List<Integer> list2 = list1.stream().map(element -> element.length())
                .collect(Collectors.toList());

        List<Integer> list3 = list2.stream().map(element -> {

                    if (element % 2 == 0) {
                        element = 228;
                    }
                    return element;
                })
                .collect(Collectors.toList());

        List<Integer> list4 = list3.stream().filter(element -> {
            if (element > 10) {
                return true;
            }
            return false;

        }).collect(Collectors.toList());

        int result = list2.stream().reduce(1, (accumulator, element) ->
                accumulator * element);
        System.out.println(result);

        String result2 = list1.stream().reduce("", (accumulator, element) ->
                accumulator + element);

        System.out.println(result2);
    }
}
