import java.util.Stack;

public class A08Stacks {
    public static void main(String[] args) {

        // Create new stack
        Stack<String> stack = new Stack<>();

        // Check if stack is empty
        System.out.println("Stack is empty? " + stack.isEmpty());

        // Push some data
        stack.push("C");
        stack.push("Java");
        stack.push("Bash");
        stack.push("JavaScript");
        stack.push("Python");

        // Print Stack
        System.out.println("Stack is empty? " + stack.isEmpty());
        System.out.println(stack);

        // Peek a an item
        String peeked = stack.peek();
        System.out.println("Peeked item is: " + peeked);

        // Pop item form the stack
        String pope = stack.pop();
        stack.remove(0);
        System.out.println(stack);
        System.out.println("Item pope is: " + pope);
    }
}
