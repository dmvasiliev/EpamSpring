package proxy;

import java.lang.reflect.Proxy;

/**
 * Created by Dmitry on 10.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        IPerson personproxy = (IPerson) Proxy.newProxyInstance(
                Person.class.getClassLoader(),
                Person.class.getInterfaces(),
                new NeverSleepingEye(person));

        personproxy.setName("Гриша");
        String h = personproxy.getName();
        System.out.println("имя :" + h);

        personproxy.rename("Вася");
        System.out.println("имя :" + personproxy.getName());

        System.out.println("");
    }
}
