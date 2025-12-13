package collectionsdemo;
import java.util.Stack;
import java.util.EmptyStackException;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        
        System.out.println("Initial stack: " + stack);
        
        // Use push() to add elements to the top of the stack
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        System.out.println("Stack after push operations: " + stack);

        // Use peek() to view the top element without removing it
        String topElement = stack.peek();
        System.out.println("Top element using peek(): " + topElement);

        // Use pop() to remove and return the top element
        String poppedElement = stack.pop();
        System.out.println("Popped element using pop(): " + poppedElement);
        System.out.println("Stack after one pop: " + stack);

        // Use empty() to check if the stack is empty
        boolean isEmpty = stack.empty();
        System.out.println("Is the stack empty? " + isEmpty);

        // Pop the rest of the elements
        stack.pop();
        stack.pop();
        
        // Check if stack is empty again
        isEmpty = stack.empty();
        System.out.println("Is the stack empty after popping all elements? " + isEmpty);

    }
}
