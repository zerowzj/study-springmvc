package study.spring.support.ext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

//@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyBeanPostProcessor.class);

    public MyBeanPostProcessor() {
        LOGGER.info("======>实例化 BeanPostProcessor");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean,
                                                  String beanName) throws BeansException {
        if (bean instanceof ExtBean) {
            LOGGER.info("======>执行 BeanPostProcessor.postProcessBeforeInitialization()");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean,
                                                 String beanName) throws BeansException {
        if (bean instanceof ExtBean) {
            LOGGER.info("======>执行 BeanPostProcessor.postProcessAfterInitialization()");
        }
        return bean;
    }
}
