package com.company.project.dao.useradmin;

import com.company.project.common.db.BaseDao;
import org.springframework.stereotype.Repository;

@Repository("userAdminDao")
public interface UserAdminDao extends BaseDao<Long, UserAdminEO> {
}
