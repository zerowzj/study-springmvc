package com.company.project.service;

import com.company.project.dao.useradmin.UserAdminDao;
import com.company.project.dao.useradmin.UserAdminEO;
import com.company.project.dao.userbase.UserBaseDao;
import com.company.project.dao.userbase.UserBaseEO;
import io.shardingsphere.api.HintManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserBaseDao ubDao;
    @Autowired
    private UserAdminDao uaDao;

    //    @Value("#{config['name']}")
//    @Value("#{config.name}")
//    @Value("${name}")
    private String name;

    @Override
    public void checkInAdmin(UserAdminEO uaEO) {
        ubDao.insert(uaEO);
        uaEO.setUaId(uaEO.getUbId());
        uaDao.insert(uaEO);
        System.out.println("name=" + name);
    }

    @Override
    public UserAdminEO get(Long uaId) {
        HintManager manager = HintManager.getInstance();
        manager.setMasterRouteOnly();
        return uaDao.get(uaId);
    }
}
