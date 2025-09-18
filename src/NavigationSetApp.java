import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigationSetApp {

    public static void main(String[] args) {

        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Indra", "Dwi", "Prabowo", "Joko", "Programmer", "Zaman", "Now"));

        NavigableSet<String> nameReverse = names.descendingSet();
        NavigableSet<String> indra = names.tailSet("Indra", true);

        for (var name : indra) {
            System.out.println(name);
        }

//        NavigableSet<String> imutable = Collections.unmodifiableNavigableSet(names);
//        imutable.add("Ups");

    }

}
