package com.xiaoxu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoxu.gulimall.common.utils.PageUtils;
import com.xiaoxu.gulimall.coupon.entity.CouponSpuRelationEntity;

import java.util.Map;

/**
 * ?Ż?ȯ????Ʒ????
 *
 * @author xiaoxu
 * @email xiaoxu@gmail.com
 * @date 2021-01-06 20:30:00
 */
public interface CouponSpuRelationService extends IService<CouponSpuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

