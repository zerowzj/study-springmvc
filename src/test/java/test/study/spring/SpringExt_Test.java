package test.study.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring/spring-context.xml")
public class SpringExt_Test {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringExt_Test.class);

    @Test
    public void test() {
    }
}
