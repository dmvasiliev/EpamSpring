package evBorisov.epamSpring.fraemwork;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Dmitry on 26.07.2016.
 */
public class BenchmarkBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        return o;
    }

    public Object postProcessAfterInitialization(final Object o, String s) throws BeansException {
        Class clazz = o.getClass();
        if (clazz.isAnnotationPresent(Benchmark.class)) {
            Object proxy = Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), new InvocationHandler() {
                public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                    long before = System.nanoTime();
                    Object retVal = method.invoke(o, args);
                    long after = System.nanoTime();
                    System.out.println(after - before);
                    return retVal;
                }
            });
            return proxy;
        } else {
            return o;
        }

    }
}
