package Collections2;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaJ {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        Consumer<Integer> c = (Integer x) -> {
            System.out.println(x);
        };
// lambda


    }
}

class City {
    String name;
}
