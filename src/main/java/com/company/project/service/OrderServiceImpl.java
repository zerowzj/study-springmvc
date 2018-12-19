package com.company.project.service;

import com.company.project.dao.orderbase.OrderBaseDao;
import com.company.project.dao.orderbase.OrderBaseEO;
import com.company.project.dao.orderitem.OrderItemDao;
import com.company.project.dao.orderitem.OrderItemEO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
