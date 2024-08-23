package circularqueueusingarray;

import java.util.Arrays;

class ArrayQueue {

    private int[] items;
    private int rear;
    private int front;
    private int count;

    public ArrayQueue(int capacity) {
        items = new int[capacity];
    }

    public void enqueue(int item) {
        if (isFull()) {
            throw new IllegalStateException();
        }
        items[rear] = item;
        rear = (rear + 1) % items.length;
        System.out.println("Rear -->" + rear);
        count++;
        System.out.println("count -->" + count);
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        var item = items[front];
        items[front] = 0;
        front = (front + 1) % items.length;
        System.out.println("front --> " + front);
        count--;
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException();
        }
        return items[front];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == items.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}

public class CircularQueueUsingArray {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        System.out.println(queue);
        //[10, 20, 30, 0, 0]
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue);
        //[0, 0, 30, 0, 0]
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println(queue);
        //[0, 0, 30, 40, 50]
        queue.enqueue(60);
        System.out.println(queue);
        //[60, 0, 30, 40, 50]
        queue.enqueue(70);
        System.out.println(queue);
        //queue.enqueue(80);
        System.out.println(queue.dequeue());
    }
}
