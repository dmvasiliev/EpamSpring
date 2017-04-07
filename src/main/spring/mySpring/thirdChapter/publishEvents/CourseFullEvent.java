package mySpring.thirdChapter.publishEvents;

/**
 * Created by Dmitry on 06.04.2017.
 */

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CourseFullEvent extends ApplicationEvent {
    private Course course;

    public CourseFullEvent(Object source, Course course) {
        super(source);
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }


    public static void main(String[] args) {
        context = new ClassPathXmlApplicationContext("mySpring/thirdChapter/resources/spring-idol.xml");
        context.publishEvent(new CourseFullEvent(new Object(), new Course()));
    }

    static ApplicationContext context;

    public void setApplicationContext(ApplicationContext applicationcontext) throws BeansException {
        //context = applicationcontext;
    }
}
