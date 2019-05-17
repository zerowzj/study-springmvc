package study.spring.support.ext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

//@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyBeanFactoryPostProcessor.class);

    public MyBeanFactoryPostProcessor() {
        LOGGER.info("======>实例化 BeanFactoryPostProcessor");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition definition = beanFactory.getBeanDefinition("study.spring.support.ext.ExtBean#0");
        MutablePropertyValues pv = definition.getPropertyValues();
        pv.add("name", "这是新增加的测试值");
        //如果
//        ExtBean extBean = beanFactory.getBean(ExtBean.class);

        LOGGER.info("======>执行 BeanFactoryPostProcessor.postProcessBeanFactory()");
    }
}
