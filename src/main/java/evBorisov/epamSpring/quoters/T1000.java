package evBorisov.epamSpring.quoters;

/**
 * Created by Dmitry on 27.07.2016.
 */
public class T1000 extends TerminatorQuoter {

    @Override
    public void sayQuote() {
        System.out.println("i'm a new terminator");
        super.sayQuote();
    }
}
