package mySpring.thirdChapter.postprocessor;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/**
 * Created by Dmitry on 03.04.2017.
 */
public class BeanCounter implements BeanFactoryPostProcessor {
    private Logger LOGGER = Logger.getLogger(BeanCounter.class);

    public void postProcessBeanFactory(ConfigurableListableBeanFactory factory) throws BeansException {
        LOGGER.debug("BEAN COUNT:  " + factory.getBeanDefinitionCount());
    }
}