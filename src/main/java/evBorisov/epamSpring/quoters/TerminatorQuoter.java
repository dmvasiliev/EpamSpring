package evBorisov.epamSpring.quoters;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Dmitry on 22.07.2016.
 */
public class TerminatorQuoter implements Quoter {

    private List<String> messages = Arrays.asList("полюбому");

    public void sayQuote() {
        for (String message : messages) {
            System.out.println("message = " + message);
        }

    }

    public List<String> getMessages() {
        return messages;
    }

    public void setMessages(List<String> messages) {
        this.messages = messages;
    }
}
