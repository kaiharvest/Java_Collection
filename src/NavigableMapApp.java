import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {

        NavigableMap<String, String> map = new TreeMap<>();

        map.put("Indra", "Indra");
        map.put("Dwi", "Dwi");
        map.put("Prabowo", "Prabowo");

        for(String key : map.keySet()){
            System.out.println(key);
        }

        System.out.println(map.lowerKey("Indra"));
        System.out.println(map.higherKey("Indra"));
        System.out.println(map.floorKey("Indra"));
        System.out.println(map.ceilingKey("Indra"));

        NavigableMap<String, String> mapDesc = map.descendingMap();
        for(String key : mapDesc.keySet()){
            System.out.println(key);
        }

        NavigableMap<String, String> empty = Collections.emptyNavigableMap();
        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(mapDesc);

        // immutable.put("Indra", "Indra");  Error

    }
}
