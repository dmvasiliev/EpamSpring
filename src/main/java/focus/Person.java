package focus;

/**
 * Created by VasDA on 25.07.2016.
 */
public class Person {
    private String firstName;
    private String family;

    public Person(String имя, String фамилия) {
        this.firstName = имя;
        this.family = фамилия;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", family='" + family + '\'' +
                '}';
    }
}
