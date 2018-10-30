package test.com.company.project;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring-context.xml")
public class SpringDITest {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringDITest.class);

    @Autowired
    private DIBean bean;

    @Test
    public void test_() {
        LOGGER.info("string= {}", bean.getaString());
        LOGGER.info("int= {}", bean.getaInteger());
        LOGGER.info("boolean= {}", bean.getaBoolean());
        LOGGER.info("array= {}", bean.getArray());
        LOGGER.info("list= {}", bean.getList());
        LOGGER.info("map= {}", bean.getMap());
        LOGGER.info("prop= {}", bean.getProp());
    }

    @Test
    public void test_1() {

    }
}
