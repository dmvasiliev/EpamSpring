package evBorisov.epamSpring.closures;

import evBorisov.epamSpring.focus.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by Dmitry on 26.07.2016.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Valera", "Brus"));
        persons.add(new Person("Semen", "Brus"));
        persons.add(new Person("Anna", "Brus"));

        Collections.sort(persons, new Comparator<Person>() {
            public int compare(Person o1, Person o2) {
                return 0;
            }
        });
    }
}
