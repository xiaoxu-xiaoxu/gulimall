package com.xiaoxu.gulimall.product;

import com.xiaoxu.gulimall.product.entity.BrandEntity;
import com.xiaoxu.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class GulimallProductApplicationTests {


    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setDescript("xiaoxu");
        brandEntity.setName("hasf");
        brandService.save(brandEntity);
        List<BrandEntity> list = brandService.list();
        System.out.println(list);
    }

}
