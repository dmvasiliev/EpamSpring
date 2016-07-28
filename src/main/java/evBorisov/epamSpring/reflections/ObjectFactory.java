package evBorisov.epamSpring.reflections;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Random;

/**
 * Created by Dmitry on 19.07.2016.
 */
public class ObjectFactory {
    public static <T> T createObject(Class<T> clazz) throws Exception {
        T object = clazz.newInstance();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Inject.class)) {
                Inject annotation = field.getAnnotation(Inject.class);
                int min = annotation.min();
                int max = annotation.max();
                field.setAccessible(true);
                field.set(object, min + new Random().nextInt(max - min));
            }
        }

        handleMethodsAnnotation(clazz, object);

        return object;
    }

    private static <T> void handleMethodsAnnotation(Class<T> clazz, T object) throws IllegalAccessException, InvocationTargetException {
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            RunThisMethod annotations = method.getAnnotation(RunThisMethod.class);
//            if (method.isAnnotationPresent(RunThisMethod.class)) {
//                method.invoke(object);
//            }

            if (annotations != null) {
                for (int i = 0; i < annotations.repeat(); i++) {
                    method.invoke(object);

                }
            }
        }
    }
}
