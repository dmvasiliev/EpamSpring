package evBorisov.epamSpring.colors;

import org.springframework.beans.factory.FactoryBean;

import java.awt.*;
import java.util.Random;

/**
 * Created by Dmitry on 28.07.2016.
 */
public class ColorFactory implements FactoryBean<Color> {

    public Color getObject() throws Exception {
        Random random = new Random();
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }

    public Class<?> getObjectType() {
        return Color.class;
    }

    public boolean isSingleton() {
        return false;
    }
}
