import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class DequeApp {

    public static void main(String[] args) {

        Deque<String> stack = new LinkedList<>();

        stack.offerFirst("Indra");
        stack.offerFirst("Dwi");
        stack.offerFirst("Prabowo");

        System.out.println("======= Ini Deque offerFirst =======");

        for (var names : stack) {
            System.out.println(names);
        }

        System.out.println("====== Ini Deque offerLast =======");

        stack.offerLast("Budi");
        stack.offerLast("Nugraha");
        stack.offerLast("Bambang");

        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());
        System.out.println(stack.pollLast());

        System.out.println("======= Ini Deque antrian =======");

        Deque<String> antrian = new LinkedList<>();

        antrian.offerLast("1");
        antrian.offerLast("2");
        antrian.offerLast("3");

        System.out.println(antrian.pollFirst());
        System.out.println(antrian.pollFirst());
        System.out.println(antrian.pollFirst());

    }

}
