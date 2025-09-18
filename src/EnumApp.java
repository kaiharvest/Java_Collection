import java.util.EnumSet;

public class EnumApp {

    public static enum Gender {
        MALE, FEMALE;
    }

    public static void main(String[] args) {

        // EnumSet<Gender> genders = EnumSet.allOf(Gender.class);
        EnumSet<Gender> genders = EnumSet.of(Gender.MALE, Gender.FEMALE);

        for (Gender gender : genders) {
            System.out.println(gender);
        }

//        Gender[] value =  Gender.values();
//        for (Gender gender : value) {
//            System.out.println(gender);
//        }

    }
}
