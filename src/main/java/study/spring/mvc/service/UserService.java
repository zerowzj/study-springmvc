package study.spring.mvc.service;

import study.spring.mvc.dao.userbase.UserBaseEO;

public interface UserService {

    void checkIn(UserBaseEO ubEO);

    UserBaseEO get(Long ubId);
}
