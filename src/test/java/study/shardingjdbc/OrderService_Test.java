package study.shardingjdbc;

import com.company.project.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-context.xml",
        "classpath:spring/spring-dao.xml",
        "classpath:spring/spring-ds-sharding.xml"})
public class OrderService_Test {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrderService_Test.class);

    @Autowired
    private OrderService orderService;

    @Test
    public void insert_test() {
        orderService.checkIn();
    }

    @Test
    public void getByOrderId_test() {
        Long orderId = 1545183209075L;
        List data = orderService.getByOrderId(orderId);
        LOGGER.info("{}", data);
    }

    @Test
    public void getByOrderIds_test() {
        List<Long> orderIds = Arrays.asList(1545124477054L, 1545183209075L);
        List data = orderService.getByOrderIds(orderIds);
        LOGGER.info("{}", data);
    }
}
