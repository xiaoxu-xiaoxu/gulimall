package com.xiaoxu.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoxu.gulimall.common.utils.PageUtils;
import com.xiaoxu.gulimall.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku??Ϣ
 *
 * @author xiaoxu
 * @email xiaoxu@gmail.com
 * @date 2021-01-05 20:51:28
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

