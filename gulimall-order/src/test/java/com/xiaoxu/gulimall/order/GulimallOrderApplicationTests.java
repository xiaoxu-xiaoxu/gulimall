package com.xiaoxu.gulimall.order;

import com.xiaoxu.gulimall.order.entity.OrderItemEntity;
import com.xiaoxu.gulimall.order.service.OrderItemService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class GulimallOrderApplicationTests {

    @Autowired
    private OrderItemService orderItemService;

    @Test
    void contextLoads() {
        List<OrderItemEntity> list = orderItemService.list();
        System.out.println(list);
    }

}
