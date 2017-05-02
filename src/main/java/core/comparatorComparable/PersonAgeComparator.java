package core.comparatorComparable;

import java.util.Comparator;

/**
 * Created by Dmitry on 02.05.2017.
 */
class PersonAgeComparator implements Comparator<Person3> {

    public int compare(Person3 a, Person3 b) {

        if (a.getAge() > b.getAge())
            return 1;
        else if (a.getAge() < b.getAge())
            return -1;
        else
            return 0;
    }
}
