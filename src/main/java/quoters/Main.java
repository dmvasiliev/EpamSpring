package quoters;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Collection;
import java.util.Map;

/**
 * Created by Dmitry on 22.07.2016.
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("application-context.xml");
//        ShakeSpearQuoter bean = classPathXmlApplicationContext.getBean(ShakeSpearQuoter.class);
//        bean.sayQuote();
//
//        System.out.println("");
//        System.out.println("");
//        System.out.println("");
//        Quoter bean2 = classPathXmlApplicationContext.getBean("terminatorQuoter", TerminatorQuoter.class);
//        bean2.sayQuote();
//
//        System.out.println("");
//        System.out.println("");
//        Map<String, Quoter> beansOfType = classPathXmlApplicationContext.getBeansOfType(Quoter.class);
//        Collection<Quoter> quoters = beansOfType.values();
//        for (Quoter quoter : quoters) {
//            quoter.sayQuote();
//        }

    }
}
