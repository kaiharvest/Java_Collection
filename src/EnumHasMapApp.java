import java.util.EnumMap;
import java.util.Map;

public class EnumHasMapApp {

    public static enum Level {
        FREE, STANDARD, PREMIUM, VIP
    }

    public static void main(String[] args) {

        Map<Level, String> map = new EnumMap<Level, String>(Level.class);
        map.put(Level.STANDARD, "Indra");
        map.put(Level.VIP, "Dwi");

        for (var key : map.keySet()) {
            System.out.println(map.get(key));
        }

    }
}
