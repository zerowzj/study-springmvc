package com.company.project.dao.userbase;

import com.company.project.common.db.BaseDao;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userBaseDao")
public interface UserBaseDao extends BaseDao<Long, UserBaseEO> {

    UserBaseEO getByUserId(Long userId);

    List<UserBaseEO> getLt(List<Long> ubIdLt, List<Long> userIdLt);
}
