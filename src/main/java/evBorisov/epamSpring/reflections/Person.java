package evBorisov.epamSpring.reflections;

/**
 * Created by Dmitry on 19.07.2016.
 */
public class Person {
    private String name;
    @Inject(min = 300, max = 350)
    private int age;

    public Person() {
    }

    @RunThisMethod(repeat = 10)
    public void printDetails() {
        System.out.println("I'm person");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
