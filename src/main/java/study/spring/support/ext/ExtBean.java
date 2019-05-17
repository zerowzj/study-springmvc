package study.spring.support.ext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class ExtBean implements InitializingBean, DisposableBean,
        BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExtBean.class);

    //@Value("123123123")
    private String name;

    @PostConstruct
    public void postConstruct() {
        LOGGER.info("======>执行 postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        LOGGER.info("======>执行 preDestroy");
    }

    public void initMethod() {
        LOGGER.info("======>执行 initMethod");
    }

    public void destroyMethod() {
        LOGGER.info("======>执行 destroyMethod");
    }

    public ExtBean() {
        LOGGER.info("======>实例化");
    }

    public void setName(String name) {
        LOGGER.info("======>依赖注入");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void destroy() throws Exception {
        LOGGER.info("======>执行 DisposableBean.destroy()");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        LOGGER.info("======>执行 InitializingBean.afterPropertiesSet()");
    }

    @Override
    public void setBeanName(String name) {
        LOGGER.info("======>执行BeanNameAware.setBeanName()");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        LOGGER.info("======>执行BeanFactoryAware.setBeanFactory()");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        LOGGER.info("======>执行ApplicationContextAware.setApplicationContext()");
    }
}
