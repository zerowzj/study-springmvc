package test.study.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import study.spring.support.ext.ExtBean;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring/spring-context.xml")
public class SpringExt_Test {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringExt_Test.class);

    @Autowired
    private ExtBean extBean;

    @Test
    public void test() {
        LOGGER.info("==>{}", extBean.getName());
    }
}
