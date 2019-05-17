package study.spring.support.ext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class ExtBean implements InitializingBean, DisposableBean {

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

    public void initMethod(){
        LOGGER.info("======>执行 initMethod");
    }

    public void destroyMethod(){
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
}
