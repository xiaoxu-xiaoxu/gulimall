package com.xiaoxu.gulimall.member;

import com.xiaoxu.gulimall.member.entity.GrowthChangeHistoryEntity;
import com.xiaoxu.gulimall.member.service.GrowthChangeHistoryService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class GulimallMemberApplicationTests {


    @Autowired
    private GrowthChangeHistoryService growthChangeHistoryService;

    @Test
    void contextLoads() {

        List<GrowthChangeHistoryEntity> list = growthChangeHistoryService.list();
        System.out.println(list);
    }

}
