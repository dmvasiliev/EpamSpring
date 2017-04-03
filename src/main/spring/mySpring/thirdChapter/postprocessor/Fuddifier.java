package mySpring.thirdChapter.postprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.lang.reflect.Field;

/**
 * Created by Dmitry on 03.04.2017.
 */
public class Fuddifier implements BeanPostProcessor {
    public Object postProcessAfterInitialization(
            Object bean, String name) throws BeansException {
        Field[] fields = bean.getClass().getDeclaredFields();
        try {
            for (int i = 0; i < fields.length; i++) { // Преобразует все
                if (fields[i].getType().equals( // строковые свойства
                        java.lang.String.class)) { // компонентов
                    fields[i].setAccessible(true);
                    String original = (String) fields[i].get(bean);
                    fields[i].set(bean, fuddify(original));
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return bean;
    }

    private String fuddify(String orig) { // Преобразует все строковые
        if (orig == null) return orig; // свойства компонентов
        return orig.replaceAll("(r|l)", "w")
                .replaceAll("(R|L)", "W");
    }

    public Object postProcessBeforeInitialization( // Перед инициализацией
                                                   Object bean, String name) throws BeansException { // ничего
        return bean; // не делает
    }
}