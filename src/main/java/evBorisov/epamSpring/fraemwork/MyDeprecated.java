package evBorisov.epamSpring.fraemwork;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Dmitry on 27.07.2016.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyDeprecated {
    Class newClass();
}
