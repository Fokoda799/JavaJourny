import java.util.Queue;
import java.util.LinkedList;

public class A09Queue {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();

        // Add farmeworks or lib
        queue.offer("Flask");
        queue.offer("Bootstrap");
        queue.offer("Express.js");
        queue.offer("React");
        queue.offer("Spring boot");

        System.out.println(queue.peek());

        System.out.println(queue);

        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        
        System.out.println(queue);

        System.out.println(queue.contains("Flask"));
    }
}
