package study.spring.support.ext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

import java.beans.PropertyDescriptor;

public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyInstantiationAwareBeanPostProcessor.class);


    public MyInstantiationAwareBeanPostProcessor() {
        LOGGER.info("======>实例化 InstantiationAwareBeanPostProcessor");
    }

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
        if(beanClass == ExtBean.class){
            LOGGER.info("======>执行InstantiationAwareBeanPostProcessor.postProcessBeforeInstantiation()");
        }
        return null;
    }

    @Override
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        if (bean instanceof ExtBean) {
            LOGGER.info("======>执行InstantiationAwareBeanPostProcessor.postProcessAfterInstantiation()");
        }
        return true;
    }

    @Override
    public PropertyValues postProcessPropertyValues(PropertyValues pvs, PropertyDescriptor[] pds,
                                                    Object bean, String beanName) throws BeansException {
        if (bean instanceof ExtBean) {
            LOGGER.info("======>执行InstantiationAwareBeanPostProcessor postProcessPropertyValues()");
        }
        return pvs;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
