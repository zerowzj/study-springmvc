package com.company.project.dao.orderitem;

import com.company.project.common.db.BaseDao;
import org.springframework.stereotype.Repository;

@Repository("OrderItemDao")
public interface OrderItemDao extends BaseDao<Long, OrderItemEO> {
}