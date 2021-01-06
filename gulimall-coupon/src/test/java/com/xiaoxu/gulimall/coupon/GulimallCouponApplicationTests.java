package com.xiaoxu.gulimall.coupon;

import com.xiaoxu.gulimall.coupon.entity.CouponHistoryEntity;
import com.xiaoxu.gulimall.coupon.service.CouponHistoryService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class GulimallCouponApplicationTests {

    @Autowired
    private CouponHistoryService couponHistoryService;

    @Test
    void contextLoads() {
        List<CouponHistoryEntity> list = couponHistoryService.list();
        System.out.println(list);
    }

}
