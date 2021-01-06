package com.xiaoxu.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoxu.gulimall.common.utils.PageUtils;
import com.xiaoxu.gulimall.order.entity.PaymentInfoEntity;

import java.util.Map;

/**
 * ֧????Ϣ?
 *
 * @author xiaoxu
 * @email xiaoxu@gmail.com
 * @date 2021-01-06 20:23:06
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

