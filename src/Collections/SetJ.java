package Collections;

import java.util.*;

public class SetJ {
    public static void main(String[] args) {
        Queue<Integer> x = new LinkedList<>();
        x.add(3);
        x.add(5);

        x.add(6);
        x.add(7);
        System.out.println(x.peek());
        x.remove();
        PriorityQueue<Integer> y = new PriorityQueue<>();
        y.add(123);
        y.add(32);
        y.add(455);
        System.out.println(y.peek());
        int sum = 0;
        List<Node> nodeSet = new ArrayList<>();
        Node node = new Node();
//        Node nodeBase = node;
//        n
    }
}

class Node {

}

