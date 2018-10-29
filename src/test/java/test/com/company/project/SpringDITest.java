package test.com.company.project;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class SpringDITest extends SpringTestBase {

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
