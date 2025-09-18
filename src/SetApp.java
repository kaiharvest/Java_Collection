import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {

        //Set<String> names = new HashSet<String>();
        Set<String> names = new LinkedHashSet<>();
        names.add("Indra");
        names.add("Dwi");
        names.add("Prabowo");
        names.add("Indra");
        names.add("Dwi");
        names.add("Prabowo");

        for(String name : names) {
            System.out.println(name);
        }

    }
}
