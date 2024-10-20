import java.util.PriorityQueue;
import java.util.Queue;

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
