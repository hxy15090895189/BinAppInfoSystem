package com.team.appInfoSystem.service;

import com.team.appInfoSystem.entity.AppCategory;

import java.util.List;

public interface CategoryService {
    //查询一级分类
    List<AppCategory> getCategoryByPrentId(Long id);
}
