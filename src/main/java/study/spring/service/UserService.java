package study.spring.service;

import study.spring.dao.userbase.UserBaseEO;

public interface UserService {

    void checkIn(UserBaseEO ubEO);

    UserBaseEO get(Long ubId);
}
