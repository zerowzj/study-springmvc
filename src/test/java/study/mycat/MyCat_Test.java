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
    public void insertUser_test() {
        UserBaseEO ubEO = new UserBaseEO();
        ubEO.setUbUserId(System.currentTimeMillis());
        ubEO.setUbLoginName("mycat");
        ubEO.setUbLoginPwd("mycat");
        userBaseDao.insert(ubEO);
    }

    @Test
    public void getByUserId_test() {
        Long userId = 1545357190670L;
        UserBaseEO ubEO = userBaseDao.getByUserId(userId);
        LOGGER.info("{}", ubEO);
    }

    @Test
    public void getUser_test() {
        userBaseDao.get(13L);
    }

    @Test
    public void insertOrder_test() {

    }
}
