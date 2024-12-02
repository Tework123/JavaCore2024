package Collections2;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

public class LambdaJ {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        Consumer<Integer> c = (Integer x) -> {
            System.out.println(x);
        };
        Runnable runnable = () -> System.out.println("Hello world!");
        Callable callable2 = () -> "123";
        Callable callable3 = () -> {
            return "123";
        };
        Runnable runnable3 = () -> {
            String[] helloWorld = {"Hello", "world!"};
            System.out.println(helloWorld[0]);
            System.out.println(helloWorld[1]);
        };

        runnable3.run();

// my lambda expression
        Test2 test2 = (s) -> {
            return s + 1;
        };
        System.out.println(test2.run(1));

// lambda


    }
}

class City {
    String name;
}
