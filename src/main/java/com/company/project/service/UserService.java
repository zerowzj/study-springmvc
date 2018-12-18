package com.company.project.service;

import com.company.project.dao.userbase.UserBaseEO;

public interface UserService {

    void checkIn(UserBaseEO ubEO);

    UserBaseEO get(Long ubId);
}
