import java.util.Arrays;
import java.util.List;

public class ArrayApp {
    public static void main(String[] args) {

        List<String> name = List.of("Indra", "Dwi", "Prabowo");

        Object[] objects = name.toArray();
        String[] strings = name.toArray(new String[]{});

        System.out.println(Arrays.toString(objects));
        System.out.println(Arrays.toString(strings));

    }
}
