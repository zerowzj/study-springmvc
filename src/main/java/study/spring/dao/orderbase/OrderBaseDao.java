package study.spring.dao.orderbase;

import study.spring.common.db.BaseDao;
import org.springframework.stereotype.Repository;
import study.spring.common.db.BaseDao;

import java.util.List;

@Repository("OrderBaseDao")
public interface OrderBaseDao extends BaseDao<Long, OrderBaseEO> {

    List getByOrderId(Long orderId);

    List getByOrderIds(List<Long> orderIds);

    List getAll();
}
