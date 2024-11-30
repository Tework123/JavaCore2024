package Collections;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.add("Hell");
        stack.add("Hell2");
        stack.add("Hell3");
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
    }
}
