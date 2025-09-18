import data.Person;

import java.util.List;

public class MutableApp {
    public static void main(String[] args) {

        Person person = new Person("Indra");

        person.addHobby("Games");
        person.addHobby("Coding");

        doSomethingHobbies(person.getHobbies());

        for (var name : person.getHobbies()) {
            System.out.println(name);
        }
    }

    public static void doSomethingHobbies(List<String> hobbies) {
        hobbies.add("bukan hobbies");
    }
}
