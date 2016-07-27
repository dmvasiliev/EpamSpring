package evBorisov.epamSpring.colors;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by VasDA on 27.07.2016.
 */
public class Main {
    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("color-context.xml");
    }
}
