package mySpring.firstChapter;

import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

/**
 * Created by Dmitry on 29.03.2017.
 */
public class HelloWorldBean implements SessionBean { // Зачем все эти методы
    public void ejbActivate() {
    }

    public void ejbPassivate() {
    }

    public void ejbRemove() {
    }

    public void setSessionContext(SessionContext ctx) {
    }

    public String sayHello() { // Основная логика компонента EJB
        return "Hello World";
    }

    public void ejbCreate() {
    }
}
