package study.spring;

import com.company.project.dao.userbase.UserBaseDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-context.xml",
        "classpath:spring/spring-dao.xml",
        "classpath:spring/spring-datasource.xml"})
public class SpringDao_Test {

    @Autowired
    private UserBaseDao userBaseDao;

    @Test
    public void get_test() {
        userBaseDao.get(65L);
    }
}
