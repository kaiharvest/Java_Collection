import java.util.Stack;

public class StackApp {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();
        stack.push("Indra");
        stack.push("Dwi");
        stack.push("Prabowo");

        for (var value = stack.peek(); value != null; value = stack.pop()) {
            System.out.println(value);
        };

    }
}
