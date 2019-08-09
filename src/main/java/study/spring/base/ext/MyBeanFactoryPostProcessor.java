package study.spring.base.ext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.annotation.Order;

//@Component
@Order(3)
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyBeanFactoryPostProcessor.class);

    public MyBeanFactoryPostProcessor() {
        LOGGER.info("======>实例化 BeanFactoryPostProcessor");
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
//        BeanDefinition definition = beanFactory.getBeanDefinition("MyBean#0");
//        MutablePropertyValues pv = definition.getPropertyValues();
//        pv.add("name", "这是新增加的测试值");
        //如果
//        MyBean extBean = beanFactory.getBean(MyBean.class);

        LOGGER.info("======>执行 BeanFactoryPostProcessor.postProcessBeanFactory()");
    }
}
