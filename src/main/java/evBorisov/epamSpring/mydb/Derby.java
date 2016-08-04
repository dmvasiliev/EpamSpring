package evBorisov.epamSpring.mydb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Dmitry on 03.08.2016.
 */
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
@Repository
@Autowired
public @interface Derby {
}
