package mySpring.secondChapter.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Dmitry on 01.04.2017.
 */
public class Main {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "mySpring/secondChapter/resources/spring-idol.xml");
//        Performer performer = (Performer) ctx.getBean("duke");
//        Performer performer = (Performer) ctx.getBean("poeticDuke");
//        performer.perform();


        ApplicationContext ctx2 = new ClassPathXmlApplicationContext(
                "mySpring/secondChapter/resources/spring-idol.xml");
        Performer performer2 = (Performer) ctx2.getBean("kenny2");
        performer2.perform();


        ApplicationContext ctx3 = new ClassPathXmlApplicationContext(
                "mySpring/secondChapter/resources/spring-idol.xml");
        Performer performer3 = (Performer) ctx3.getBean("kenny3");
        performer3.perform();


        ApplicationContext ctx4 = new ClassPathXmlApplicationContext(
                "mySpring/secondChapter/resources/spring-idol.xml");
        Performer performer4 = (Performer) ctx4.getBean("duke2");
        performer4.perform();

        ApplicationContext ctx5 = new ClassPathXmlApplicationContext(
                "mySpring/secondChapter/resources/spring-idol.xml");
        Performer performer5 = (Performer) ctx5.getBean("hank2");
        performer5.perform();


        ApplicationContext ctx6 = new ClassPathXmlApplicationContext(
                "mySpring/secondChapter/resources/spring-idol.xml");
        Performer performer6 = (Performer) ctx6.getBean("hank3");
        performer6.perform();
    }

}
