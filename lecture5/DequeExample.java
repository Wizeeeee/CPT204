package lecture5;
import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {
        // Create a Deque using LinkedList
        Deque<String> deque = new LinkedList<>();

        // Add elements to the deque
        deque.addFirst("Oklahoma");
        deque.addLast("Indiana");
        deque.addLast("Georgia");
        deque.addLast("Texas");

        // Display and remove elements from the deque
        System.out.println("Deque elements:");
        while (!deque.isEmpty()) {
            System.out.print(deque.removeFirst() + " ");
        }
    }
}