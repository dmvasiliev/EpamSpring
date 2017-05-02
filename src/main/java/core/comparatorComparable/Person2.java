package core.comparatorComparable;

/**
 * Created by Dmitry on 02.05.2017.
 */
class Person2 implements Comparable<Person> {

    private String name;

    public Person2(String value) {

        name = value;
    }

    String getName() {
        return name;
    }

    public int compareTo(Person p) {

        return name.compareTo(p.getName());
    }
}
