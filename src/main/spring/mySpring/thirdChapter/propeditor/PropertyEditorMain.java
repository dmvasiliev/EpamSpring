package mySpring.thirdChapter.propeditor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Dmitry on 03.04.2017.
 */
public class PropertyEditorMain {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext(
                        "com/springinaction/chapter03/propeditor/propEditorDemo.xml");

        Contact contact = (Contact) ctx.getBean("contact");
        PhoneNumber phoneNumber = contact.getPhoneNumber();
        System.out.println("Phone number:  " +
                "(" + phoneNumber.getAreaCode() + ") " +
                phoneNumber.getPrefix() + "-" +
                phoneNumber.getNumber());
    }
}
