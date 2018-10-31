package com.company.project.service;

import com.company.project.dao.useradmin.UserAdminDao;
import com.company.project.dao.useradmin.UserAdminEO;
import com.company.project.dao.userbase.UserBaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserBaseDao ubDao;
    @Autowired
    private UserAdminDao uaDao;
    @Value("${}")
    private String str;

    @Override
    public void checkInAdmin(UserAdminEO uaEO) {

    }
}
