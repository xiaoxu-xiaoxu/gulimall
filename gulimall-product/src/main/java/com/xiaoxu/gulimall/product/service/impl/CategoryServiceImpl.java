package com.xiaoxu.gulimall.product.service.impl;

import com.xiaoxu.gulimall.common.utils.Query;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaoxu.gulimall.common.utils.PageUtils;

import com.xiaoxu.gulimall.product.dao.CategoryDao;
import com.xiaoxu.gulimall.product.entity.CategoryEntity;
import com.xiaoxu.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    // 三级菜单查询
    @Override
    public List<CategoryEntity> selectTreeCategory() {
        List<CategoryEntity> allCategories = baseMapper.selectList(null);
        return allCategories
                .stream()
                .filter(oneMnue -> oneMnue.getParentCid() == 0)
                .peek(m -> m.setChildren(getChildrens(m, allCategories)))
                .sorted(Comparator.comparingInt(m -> (m.getSort() == null ? 0 : m.getSort())))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteByIds(List<Long> asList) {
        this.removeByIds(asList);
    }

    private List<CategoryEntity> getChildrens(CategoryEntity m, List<CategoryEntity> allCategories) {
        return allCategories
                .stream()
                .filter(cM -> cM.getParentCid().equals(m.getCatId()))
                .peek(m2 -> m2.setChildren(getChildrens(m2, allCategories)))
                .sorted(Comparator.comparingInt(m1 -> (m1.getSort() == null ? 0 : m1.getSort())))
                .collect(Collectors.toList());
    }


}