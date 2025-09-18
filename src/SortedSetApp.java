import data.Person;
import data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {

    public static void main(String[] args) {

        SortedSet<Person> people = new TreeSet<Person>(new PersonComparator());

        people.add(new Person("Indra"));
        people.add(new Person("Dwi"));
        people.add(new Person("Prabowo"));

        for (Person person : people) {
            System.out.println(person.getName());
        }

        SortedSet<Person> people1 = Collections.unmodifiableSortedSet(people);
        // people1.add(new Person("Indra"));

    }

}
