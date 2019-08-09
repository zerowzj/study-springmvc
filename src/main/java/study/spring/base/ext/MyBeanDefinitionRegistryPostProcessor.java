package study.spring.base.ext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.core.annotation.Order;

@Order(2)
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyBeanDefinitionRegistryPostProcessor.class);

    public MyBeanDefinitionRegistryPostProcessor() {
        LOGGER.info("======>实例化 BeanDefinitionRegistryPostProcessor");
    }

    /**
     * 所有Bean定义将要被加载，Bean实例还未创建的时候运行，它优先于postProcessBeanFactory方法执行
     */
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        LOGGER.info("======>执行 BeanDefinitionRegistryPostProcessor.postProcessBeanDefinitionRegistry()");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        LOGGER.info("SSSS");
    }
}
