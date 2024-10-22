import java.util.PriorityQueue;
import java.util.Queue;

/* PriorityQueue is a queue that orders its elements according to their 
natural ordering or by a Comparator provided at queue construction time. */

public class A10PriorityQueue {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>();

        queue.offer("A");
        queue.offer("F");
        queue.offer("D");
        queue.offer("C");
        queue.offer("B");

        System.out.println(queue);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
