package core.comparatorComparable;

import java.util.Comparator;

/**
 * Created by Dmitry on 02.05.2017.
 */
class PersonComparator implements Comparator<Person> {

    public int compare(Person a, Person b) {

        return a.getName().compareTo(b.getName());
    }
}