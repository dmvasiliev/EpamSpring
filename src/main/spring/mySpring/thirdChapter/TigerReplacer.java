package mySpring.thirdChapter;

import org.springframework.beans.factory.support.MethodReplacer;

import java.lang.reflect.Method;

/**
 * Created by Dmitry on 02.04.2017.
 */
public class TigerReplacer implements MethodReplacer {
    @Override
    public Object reimplement(Object target, Method method, // Подмена
                              Object[] args) throws Throwable { // метода
        return "A ferocious tiger"; // Помещает тигра в ящик
    }
}
