package evBorisov.epamSpring.reflections;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Dmitry on 19.07.2016.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface RunThisMethod {
    int repeat();
}
