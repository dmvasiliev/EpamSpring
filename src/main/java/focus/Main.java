package focus;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by VasDA on 25.07.2016.
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        Person bean = context.getBean(Person.class);
        System.out.println(bean);
    }
}
