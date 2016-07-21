package reflections;

import java.lang.reflect.Method;

/**
 * Created by Dmitry on 19.07.2016.
 */
public class ObjectFactory {
    public static <T> T createObject(Class<T> clazz) throws Exception {
        T object = clazz.newInstance();
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

        return object;
    }
}
