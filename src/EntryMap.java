import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryMap {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("Indra", "Indra Value");
        map.put("Dwi", "Dwi Value");
        map.put("Prabowo", "Prabowo Value");

        Set<Map.Entry<String, String >> entrys = map.entrySet();

        for (var entry : entrys) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
