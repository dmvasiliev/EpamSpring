package mySpring.thirdChapter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Dmitry on 01.04.2017.
 */
public class Main {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "mySpring/thirdChapter/resources/spring-idol.xml");
        Performer taylor = (Performer) ctx.getBean("taylor");
        Performer stevie = (Performer) ctx.getBean("stevie");
        taylor.perform();
        stevie.perform();

        Performer magician = (Performer) ctx.getBean("harry");
        magician.perform();

    }

}
