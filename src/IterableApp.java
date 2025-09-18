import java.util.List;

public class IterableApp {
    public static void main(String[] args) {

        Iterable<String> names = List.of("Indra", "Dwi", "Prabowo");
        for (String name : names) {
            System.out.println(name);
        }

    }
}
