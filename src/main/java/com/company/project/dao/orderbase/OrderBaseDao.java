package com.company.project.dao.orderbase;

import com.company.project.common.db.BaseDao;
import org.springframework.stereotype.Repository;

@Repository("OrderBaseDao")
public interface OrderBaseDao extends BaseDao<Long, OrderBaseEO> {
}
