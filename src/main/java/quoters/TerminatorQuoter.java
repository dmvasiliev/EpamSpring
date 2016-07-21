package quoters;

import java.util.List;

/**
 * Created by Dmitry on 22.07.2016.
 */
public class TerminatorQuoter implements Quoter {

    private List<String> messages;

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
