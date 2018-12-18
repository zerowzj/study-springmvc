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

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-context.xml",
        "classpath:spring/spring-dao.xml",
        "classpath:spring/spring-ds-sharding.xml"})
public class ShardingJdbc_Test {

    private static final Logger LOGGER = LoggerFactory.getLogger(ShardingJdbc_Test.class);

    @Autowired
    private UserBaseDao userBaseDao;

    @Test
    public void insert_test() {
        UserBaseEO ubEO = new UserBaseEO();
        ubEO.setUserId(System.currentTimeMillis());
        ubEO.setUbLoginName("test1");
        ubEO.setUbLoginPwd("test1");
        userBaseDao.insert(ubEO);
    }

    @Test
    public void getByUserId_test(){
        userBaseDao.getByUserId(1545095447416L);
    }

    @Test
    public void get_test(){
        userBaseDao.get(34L);
    }
}
