package evBorisov.epamSpring.quoters;

import org.springframework.stereotype.Component;

/**
 * Created by Dmitry on 05.08.2016.
 */
@Component
public class RussianFilmsQuoter implements Quoter {
    public void sayQuote() {
        System.out.println("Москва слезам не верит");
    }
}
