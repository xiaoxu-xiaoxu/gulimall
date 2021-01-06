package com.xiaoxu.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoxu.gulimall.common.utils.PageUtils;
import com.xiaoxu.gulimall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * ?Ż?ȯ??ȡ??ʷ??¼
 *
 * @author xiaoxu
 * @email xiaoxu@gmail.com
 * @date 2021-01-06 20:30:00
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

