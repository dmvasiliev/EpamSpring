package evBorisov.epamSpring.mydb;

import org.springframework.stereotype.Repository;

/**
 * Created by Dmitry on 03.08.2016.
 */
@Repository
@Oracle
public class OracleDao implements Dao {
    public void crud() {
        System.out.println("I'm oracle dao...");
    }
}
