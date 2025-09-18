import java.util.*;

public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(9);
        stack.pop();
        System.out.println(stack);
    }
}
