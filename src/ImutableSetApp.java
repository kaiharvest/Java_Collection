import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImutableSetApp {

    public static void main(String[] args) {

        Set<String> emty = Collections.emptySet();
        Set<String> one = Collections.singleton("Indra");
        
        Set<String> mutable = new HashSet<>();
        mutable.add("Joko");
        mutable.add("Dwi");
        mutable.add("Suseno");

        Set<String> set = Set.of("Indra", "Dwi", "Prabowo");
        // set.remove("Indra"); error
        // set.add("Joko"); error

    }

}
