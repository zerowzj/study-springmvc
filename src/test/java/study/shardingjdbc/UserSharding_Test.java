package study.shardingjdbc;

import com.company.project.dao.userbase.UserBaseDao;
import com.company.project.dao.userbase.UserBaseEO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-context.xml",
        "classpath:spring/spring-dao.xml",
        "classpath:spring/spring-ds-sharding.xml"})
public class UserSharding_Test {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserSharding_Test.class);

    @Autowired
    private UserBaseDao userBaseDao;

    @Test
    public void insert_test() {
        UserBaseEO ubEO = new UserBaseEO();
        ubEO.setUbUserId(System.currentTimeMillis());
        ubEO.setUbLoginName("sharding-jdbc");
        ubEO.setUbLoginPwd("sharding-jdbc");
        userBaseDao.insert(ubEO);
    }

    @Test
    public void getByUserId_test() {
        Long userId = 1545635736265L;
        UserBaseEO ubEO = userBaseDao.getByUserId(userId);
        LOGGER.info("{}", ubEO.getUbLoginName());
    }

    @Test
    public void get_test() {
        userBaseDao.get(11L);
    }

    @Test
    public void getLt_test() {
        List<Long> ubIdLt = Arrays.asList(7L, 20L);
        List<Long> userIdLt = Arrays.asList(1545637813608L, 1545635736265L);
        userBaseDao.getLt(ubIdLt, userIdLt);
    }
}
