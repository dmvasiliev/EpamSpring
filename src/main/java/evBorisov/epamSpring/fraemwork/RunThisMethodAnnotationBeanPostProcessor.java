package evBorisov.epamSpring.fraemwork;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Dmitry on 26.07.2016.
 */
public class RunThisMethodAnnotationBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        Method[] methods = o.getClass().getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(RunThisMethod.class)) {
                try {
                    method.invoke(o);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        return o;
    }
}
