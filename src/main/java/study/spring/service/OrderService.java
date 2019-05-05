package study.spring.service;

import java.util.List;

public interface OrderService {

    void checkIn();

    List getByOrderId(Long orderId);

    List getByOrderIds(List<Long> orderIds);

    List getAll();
}
