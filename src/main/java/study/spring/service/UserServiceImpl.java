package study.spring.service;

import io.shardingsphere.api.HintManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;
import study.spring.dao.userbase.UserBaseDao;
import study.spring.dao.userbase.UserBaseEO;

@Service("userService")
public class UserServiceImpl implements UserService, ApplicationContextAware {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private UserBaseDao ubDao;

    public UserServiceImpl(){
        LOGGER.info("===>UserServiceImpl");
    }

    //    @Value("#{config['name']}")
//    @Value("#{config.name}")
//    @Value("${name}")
    private String name;

    @Override
    public void checkIn(UserBaseEO ubEO) {
        ubDao.insert(ubEO);
        System.out.println("name=" + name);
    }

    @Override
    public UserBaseEO get(Long ubId) {
        HintManager manager = HintManager.getInstance();
        manager.setMasterRouteOnly();
        return ubDao.get(ubId);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        LOGGER.info("===>{}", applicationContext.getApplicationName());
    }
}
