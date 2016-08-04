package evBorisov.epamSpring.mydb;

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Dmitry on 03.08.2016.
 */
@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface Derby {
}
