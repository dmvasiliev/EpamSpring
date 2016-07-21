package quoters;

/**
 * Created by Dmitry on 22.07.2016.
 */
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
