package com.team.appInfoSystem.service.impl;

import com.team.appInfoSystem.entity.AppCategory;
import com.team.appInfoSystem.entity.AppCategoryExample;
import com.team.appInfoSystem.mapper.AppCategoryMapper;
import com.team.appInfoSystem.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private AppCategoryMapper appCategoryMapper;
    @Override
    public List<AppCategory> getCategoryByPrentId(Long id) {
        AppCategoryExample appCategoryExample = new AppCategoryExample();
        AppCategoryExample.Criteria criteria = appCategoryExample.createCriteria();
        if (id==null){
            criteria.andParentidIsNull();
        }else {
            criteria.andParentidEqualTo(id);
        }
        return appCategoryMapper.selectByExample(appCategoryExample);
    }
}
