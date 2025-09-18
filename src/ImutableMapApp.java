import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ImutableMapApp {
    public static void main(String[] args) {

        Map<String, String> empty = Collections.emptyMap();
        Map<String, String> singleton = Collections.singletonMap("name", "Indra");

        Map<String, String> mutable = new HashMap<>();
        mutable.put("name", "Indra");
        Map<String, String> immutable = Collections.unmodifiableMap(mutable);

        Map<String, String> map = Map.of(
                "first", "Indra",
                "middle", "Dwi",
                "last", "Prabowo"
        );

        // map.put("a", "A"); Error

    }
}
