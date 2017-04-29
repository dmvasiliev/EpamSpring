package inAction4.chapter1;

import inAction4.chapter1.config.KnightConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class KnightMain {

    public static void main(String[] args) throws Exception {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("mySpring/inAction4/chapter1/resources/knight.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KnightConfig.class);
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }

}
