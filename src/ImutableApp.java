import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImutableApp {
    public static void main(String[] args) {

        List<String> one = Collections.singletonList("Satu");
        List<String> emptyList = Collections.emptyList();

        List<String> mutable = new ArrayList<>();
        mutable.add("Indra");
        mutable.add("Dwi");
        List<String> imutable = Collections.unmodifiableList(mutable);

        List<String> element = List.of("Indra", "Dwi", "Prabowo");

    }
}
