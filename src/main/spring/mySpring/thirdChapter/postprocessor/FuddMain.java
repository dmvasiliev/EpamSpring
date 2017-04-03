package mySpring.thirdChapter.postprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Dmitry on 03.04.2017.
 */
public class FuddMain {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext(
                        "mySpring/thirdChapter/resources/spring-idol.xml");

        Rabbit bugs = (Rabbit) ctx.getBean("bugs");

        System.out.println(bugs.getDescription());


        ctx.getBean("beanCounter");
    }
}
