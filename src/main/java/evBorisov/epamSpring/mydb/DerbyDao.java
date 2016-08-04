package evBorisov.epamSpring.mydb;

/**
 * Created by Dmitry on 03.08.2016.
 */

@Derby
public class DerbyDao implements Dao {
    public void crud() {
        System.out.println("I'm derby dao");
    }
}
