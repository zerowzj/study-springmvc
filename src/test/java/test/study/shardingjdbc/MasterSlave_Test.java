package test.study.shardingjdbc;

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
        "classpath:spring/spring-ds-ms.xml"})
public class MasterSlave_Test {

    private static final Logger LOGGER = LoggerFactory.getLogger(MasterSlave_Test.class);

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
//        HintManager.getInstance().setMasterRouteOnly();
        UserBaseEO ubEO = userBaseDao.getByUserId(1545819049828L);
        LOGGER.info("{}", ubEO.getUbLoginName());
    }

    @Test
    public void get_test() {
        userBaseDao.get(11L);
    }
}
