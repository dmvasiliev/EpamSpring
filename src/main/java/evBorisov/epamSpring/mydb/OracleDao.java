package evBorisov.epamSpring.mydb;

/**
 * Created by Dmitry on 03.08.2016.
 */

@Oracle
public class OracleDao implements Dao {
    public void crud() {
        System.out.println("I'm oracle dao...");
    }
}
