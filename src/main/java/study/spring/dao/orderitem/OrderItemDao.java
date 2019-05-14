package study.spring.dao.orderitem;

import study.spring.common.db.BaseDao;
import org.springframework.stereotype.Repository;
import study.spring.common.db.BaseDao;

@Repository("OrderItemDao")
public interface OrderItemDao extends BaseDao<Long, OrderItemEO> {
}
