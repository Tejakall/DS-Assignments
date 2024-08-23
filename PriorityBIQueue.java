import java.util.PriorityQueue;

public class PriorityBIQueue {

    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        // Add 2 strings to PriorityQueue.
        queue.add("cat");
        queue.add("dog");
        queue.add("antelope");
        queue.add("horse");
        // Loop over and display contents of PriorityQueue.
        for (String element : queue) {
            System.out.println(element);
        }
        // Use peek.
        // ... The element that is sorted first is returned.
        // ... The queue is not changed.
        System.out.println("Peeked Element = " + queue.peek());
        // Poll all elements in the PriorityQueue.
        while (queue.size() > 0) {
            // Get polled element and print it.
            System.out.println("Polled element = " + queue.poll());
        }
    }
}
