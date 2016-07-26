package evBorisov.epamSpring.fraemwork;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanDefinition;

/**
 * Created by Dmitry on 27.07.2016.
 */
public class DeprecatedReplaceBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            AbstractBeanDefinition beanDefinition = (AbstractBeanDefinition) beanFactory.getBeanDefinition(beanDefinitionName);

            String originalClassName = beanDefinition.getBeanClassName();
            try {
                Class<?> originalClass = Class.forName(originalClassName);
                MyDeprecated annotation = originalClass.getAnnotation(MyDeprecated.class);
                if (annotation != null) {
                    beanDefinition.setBeanClass(annotation.newClass());
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
