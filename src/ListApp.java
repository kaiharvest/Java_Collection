import java.util.ArrayList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();

        strings.add("Indra");
        strings.add("Dwi");

        strings.set(0, "Prabowo");

        strings.remove(1);

        System.out.println(strings.get(0));

        for (var name : strings) {
            System.out.println(name);
        }

    }
}
