package evBorisov.epamSpring.reflections;

/**
 * Created by Dmitry on 19.07.2016.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Person person = ObjectFactory.createObject(Person.class);
    }
}
