package study.spring.service;

import com.company.project.dao.userbase.UserBaseDao;
import com.company.project.dao.userbase.UserBaseEO;
import io.shardingsphere.api.HintManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserBaseDao ubDao;

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
}
