package study.spring;

import com.company.project.dao.useradmin.UserAdminEO;
import com.company.project.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-context.xml",
        "classpath:spring/spring-dao.xml",
        "classpath:spring/spring-ds-ms.xml"})
public class SpringService_Test {

    @Autowired
    private UserService userService;

    @Test
    public void checkInAdmin_test(){
        UserAdminEO uaEO = new UserAdminEO();
        uaEO.setUbLoginName("test2");
        uaEO.setUbLoginPwd("test2");
        userService.checkInAdmin(uaEO);
    };


    @Test
    public void get_test() {
        userService.get(1L);
    }
}
