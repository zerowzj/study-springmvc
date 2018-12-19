package com.company.project.dao.orderbase;

import com.company.project.common.db.BaseDao;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("OrderBaseDao")
public interface OrderBaseDao extends BaseDao<Long, OrderBaseEO> {

    List getByOrderId(Long orderId);

    List getByOrderIds(List<Long> orderIds);
}
