package com.team.appInfoSystem.controller;

import com.team.appInfoSystem.entity.AppCategory;
import com.team.appInfoSystem.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @RequestMapping("/getcategory")
    @ResponseBody
    public List<AppCategory> getCategory(Long id){
        List<AppCategory> categoryByPrentId = categoryService.getCategoryByPrentId(id);
        return categoryByPrentId;
    }
}
