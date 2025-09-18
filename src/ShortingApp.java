import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShortingApp {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.addAll(List.of("Indra", "Dwi", "Prabowo", "Joko", "Budi", "Now"));

        Collections.sort(list);

        for (var value : list) {
            System.out.println(value);
        }

    }
}
