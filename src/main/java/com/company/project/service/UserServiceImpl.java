package com.company.project.service;

import com.company.project.dao.useradmin.UserAdminDao;
import com.company.project.dao.useradmin.UserAdminEO;
import com.company.project.dao.userbase.UserBaseDao;
import io.shardingsphere.api.HintManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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
        HintManager hintManager = HintManager.getInstance();
        hintManager.setMasterRouteOnly();
        System.out.println("name=" + name);
    }
}
