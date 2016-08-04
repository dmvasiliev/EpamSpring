package evBorisov.epamSpring.quoters;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;

/**
 * Created by Dmitry on 22.07.2016.
 */
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class ShakeSpearQuoter implements Quoter {

    private String message;

    public void sayQuote() {
        System.out.println(message);
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
