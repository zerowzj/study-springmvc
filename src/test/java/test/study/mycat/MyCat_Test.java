package test.study.mycat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import study.spring.mvc.dao.userbase.UserBaseDao;
import study.spring.mvc.dao.userbase.UserBaseEO;

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
        Long userId = 1545622150623L;
        UserBaseEO ubEO = userBaseDao.getByUserId(userId);
        LOGGER.info("{}", ubEO.getUbLoginName());
    }

    @Test
    public void getUser_test() {
        userBaseDao.get(13L);
    }

    @Test
    public void insertOrder_test() {
        LOGGER.info("1545483365506 % 3={}", 1545483365506L % 3);
        LOGGER.info("1545483439211 % 3={}", 1545483439211L % 3);
    }
}
