package mySpring.thirdChapter.publishEvents;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by Dmitry on 06.04.2017.
 */
public class CourseFullEventListener implements ApplicationListener {
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("Listening to event");
    }
}