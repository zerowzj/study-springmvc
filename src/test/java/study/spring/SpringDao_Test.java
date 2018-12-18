package study.spring;

import com.company.project.dao.useradmin.UserAdminDao;
import com.company.project.dao.useradmin.UserAdminEO;
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
        "classpath:spring/spring-ds-sharding.xml"})
public class SpringDao_Test {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringDao_Test.class);

    @Autowired
    private UserBaseDao userBaseDao;
    @Autowired
    private UserAdminDao userAdminDao;

    @Test
    public void insert_test() {
        UserBaseEO ubEO = new UserBaseEO();
        ubEO.setUserId(System.currentTimeMillis());
        ubEO.setUbLoginName("test1");
        ubEO.setUbLoginPwd("test1");
        userBaseDao.insert(ubEO);

        UserAdminEO uaEO = new UserAdminEO();
        uaEO.setUaId(ubEO.getUbId());
        userAdminDao.insert(uaEO);
    }

    @Test
    public void get_test() {
        UserAdminEO uaEO = userAdminDao.get(1L);
        LOGGER.info("uaEO={}", uaEO);
    }
}
