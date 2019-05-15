package study.spring.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import study.spring.dao.orderbase.OrderBaseDao;
import study.spring.dao.orderbase.OrderBaseEO;
import study.spring.dao.orderitem.OrderItemDao;
import study.spring.dao.orderitem.OrderItemEO;

import java.util.List;

@Service("orderService")
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderBaseDao orderBaseDao;
    @Autowired
    private OrderItemDao orderItemDao;

    @Override
    public void checkIn() {
        Long orderId = System.currentTimeMillis();
        OrderBaseEO rbEO = new OrderBaseEO();
        rbEO.setRbOrderId(orderId);
        orderBaseDao.insert(rbEO);

        OrderItemEO riEO = new OrderItemEO();
        riEO.setRiOrderId(orderId);
        orderItemDao.insert(riEO);
    }

    @Override
    public List getByOrderId(Long orderId) {
        return orderBaseDao.getByOrderId(orderId);
    }

    @Override
    public List getByOrderIds(List<Long> orderIds) {
        return orderBaseDao.getByOrderIds(orderIds);
    }

    @Override
    public List getAll() {
        return orderBaseDao.getAll();
    }
}
