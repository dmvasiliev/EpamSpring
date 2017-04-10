package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Dmitry on 10.04.2017.
 */
public class NeverSleepingEye implements InvocationHandler {
    private Object obj;

    public NeverSleepingEye(Object f1) {
        obj = f1;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("NeverSleepingEye invoke : " + method.getName());
        return method.invoke(obj, args);
    }
}