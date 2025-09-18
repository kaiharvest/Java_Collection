import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LInkedHasMapApp {
    public static void main(String[] args) {

        Map<String, String> map = new LinkedHashMap<>();
        map.put("First", "Indra");
        map.put("Middle", "Dwi");
        map.put("Last", "Prabowo");

        Set<String> keys = map.keySet();
        for (var key : keys) {
            System.out.println(key);
        }

    }
}
