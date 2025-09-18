import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CollectionApp {
    public static void main(String[] args) {

        System.out.println("===== Menambahkan data =====");
        Collection<String> collection = new ArrayList<>();
        collection.add("Indra");
        collection.add("Dwi");
        collection.addAll(Arrays.asList("Prabowo", "Programmer", "Java"));

        for (var name : collection) {
            System.out.println(name);
        }

        System.out.println("===== Remove =====");
        collection.remove("Indra");
        collection.removeAll(Arrays.asList("Prabowo", "Programmer"));

        for (String name : collection) {
            System.out.println(name);
        }

        System.out.println("===== Mengecek apakah datanya masih ada =====");

        System.out.println(collection.contains("Prabowo"));
        System.out.println(collection.containsAll(Arrays.asList("Dwi", "Java")));

    }
}
