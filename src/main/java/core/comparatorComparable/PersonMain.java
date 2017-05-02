package core.comparatorComparable;

import java.util.TreeSet;

/**
 * Created by Dmitry on 02.05.2017.
 */
public class PersonMain {

    public static void main(String[] args) {

        TreeSet<Person> people1 = new TreeSet<Person>();
        people1.add(new Person("Tom"));


        PersonComparator pcomp = new PersonComparator();
        TreeSet<Person> people = new TreeSet<Person>(pcomp);
        people.add(new Person("Tom"));
        people.add(new Person("Nick"));
        people.add(new Person("Alice"));
        people.add(new Person("Bill"));
        for (Person p : people) {

            System.out.println(p.getName());
        }
    }
}
