package core.comparatorComparable;

import java.util.Comparator;

/**
 * Created by Dmitry on 02.05.2017.
 */
class PersonNameComparator implements Comparator<Person3> {

    public int compare(Person3 a, Person3 b) {

        return a.getName().compareTo(b.getName());
    }
}
