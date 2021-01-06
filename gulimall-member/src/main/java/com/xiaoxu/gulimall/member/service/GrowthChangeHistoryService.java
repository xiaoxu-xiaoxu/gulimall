package com.xiaoxu.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoxu.gulimall.common.utils.PageUtils;
import com.xiaoxu.gulimall.member.entity.GrowthChangeHistoryEntity;

import java.util.Map;

/**
 * ?ɳ?ֵ?仯??ʷ??¼
 *
 * @author xiaoxu
 * @email xiaoxu@gmail.com
 * @date 2021-01-06 20:35:42
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

