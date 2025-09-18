import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {

    public static void main(String[] args) {

        // Queue<String> name = new ArrayDeque<>();
        Queue<String> name = new PriorityQueue<>();
        // Queue<String> name = new LinkedList<>();

        name.add("Indra");
        name.add("Dwi");
        name.add("Prabowo");

        for (String next = name.poll(); next != null; next = name.poll()){
            System.out.println(next);
        }

        System.out.println(name.size());

    }

}
