import java.util.ArrayDeque;

public class BuiltInQueue {

    public static void main(String[] args) {
        var queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.element());
        queue.offer(40);
        queue.offer(50);
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
    }
}
