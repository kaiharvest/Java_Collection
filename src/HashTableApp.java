import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {
    public static void main(String[] args) {

        Map<String, String> map = new Hashtable<>();
        map.put("Indra", "Indra");
        map.put("Dwi", "Dwi");
        map.put("Prabowo", "Prabowo");

        for (var name : map.keySet()) {
            System.out.println(name);
        }

    }
}
