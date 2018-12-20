package study.mycat;

import com.company.project.dao.userbase.UserBaseDao;
import com.company.project.dao.userbase.UserBaseEO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-context.xml",
        "classpath:spring/spring-dao.xml",
        "classpath:spring/spring-ds.xml"})
public class MyCat_Test {

    private static final Logger LOGGER = LoggerFactory.getLogger(MyCat_Test.class);

    @Autowired
    private UserBaseDao userBaseDao;

    @Test
    public void insert_test() {
        UserBaseEO ubEO = new UserBaseEO();
        ubEO.setUbUserId(System.currentTimeMillis());
        ubEO.setUbLoginName("test2");
        ubEO.setUbLoginPwd("test2");
        userBaseDao.insert(ubEO);
    }

    @Test
    public void getByUserId_test() {
        UserBaseEO ubEO = userBaseDao.getByUserId(1545275728356L);
        LOGGER.info("{}", ubEO);
    }

    @Test
    public void get_test() {
        userBaseDao.get(13L);
    }
}
