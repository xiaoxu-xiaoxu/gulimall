package com.xiaoxu.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoxu.gulimall.common.utils.PageUtils;
import com.xiaoxu.gulimall.order.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 * ?????˻????
 *
 * @author xiaoxu
 * @email xiaoxu@gmail.com
 * @date 2021-01-06 20:23:07
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

