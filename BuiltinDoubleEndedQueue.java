import java.util.ArrayDeque;
public class BuiltInDoubleEndedQueue {
 public static void main(String[] args) {
 var queue = new ArrayDeque<>();
 queue.add(10);
 queue.add(20);
 queue.add(30);
 System.out.println(queue);
 System.out.println(queue.peek());
 System.out.println(queue.element());
 queue.addFirst(40);
 queue.addFirst(50);
 System.out.println(queue);
 System.out.println(queue.removeLast());
 System.out.println(queue);
 }
}
