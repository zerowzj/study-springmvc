package com.company.project.service;

import java.util.List;

public interface OrderService {

    void checkIn();

    List getByOrderId(Long orderId);
}
