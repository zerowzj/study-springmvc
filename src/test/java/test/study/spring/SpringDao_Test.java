package test.study.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import study.spring.dao.userbase.UserBaseDao;
import study.spring.dao.userbase.UserBaseEO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-context.xml",
        "classpath:spring/spring-dao.xml",
        "classpath:spring/spring-ds-sharding.xml"})
public class SpringDao_Test {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringDao_Test.class);

    @Autowired
    private UserBaseDao userBaseDao;


    @Test
    public void insert_test() {
        UserBaseEO ubEO = new UserBaseEO();
        ubEO.setUbUserId(System.currentTimeMillis());
        ubEO.setUbLoginName("test1");
        ubEO.setUbLoginPwd("test1");
        userBaseDao.insert(ubEO);
    }

    @Test
    public void get_test() {

    }
}
