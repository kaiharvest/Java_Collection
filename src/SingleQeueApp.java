import collection.SingleQeue;

import java.util.Queue;

public class SingleQeueApp {
    public static void main(String[] args) {

        Queue<String> queue = new SingleQeue<>();
        System.out.println(queue.size());

        System.out.println(queue.offer("Indra"));
        System.out.println(queue.offer("Dwi"));
        System.out.println(queue.offer("Prabowo"));

        System.out.println(queue.size());

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println(queue.size());

    }
}
