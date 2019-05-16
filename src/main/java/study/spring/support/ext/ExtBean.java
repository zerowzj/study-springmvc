package study.spring.support.ext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

//@Component
public class ExtBean {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExtBean.class);

//    @Value("123123123")
    private String name;

    @PostConstruct
    public void init() {
        LOGGER.info("初始化");
    }

    public ExtBean() {
        LOGGER.info("实例化");
    }

    public void setName(String name) {
        LOGGER.info("依赖注入");
        this.name = name;
    }
}
