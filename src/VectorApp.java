import java.util.List;
import java.util.Vector;

public class VectorApp {
    public static void main(String[] args) {

        List<String> list = new Vector<>();
        list.add("Indra");
        list.add("Dwi");
        list.add("Prabowo");

        for (var name : list) {
            System.out.println(name);
        }

    }
}
