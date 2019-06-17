package study.spring.mvc.dao.orderitem;

import study.spring.mvc.common.db.BaseDao;
import org.springframework.stereotype.Repository;

@Repository("OrderItemDao")
public interface OrderItemDao extends BaseDao<Long, OrderItemEO> {
}
