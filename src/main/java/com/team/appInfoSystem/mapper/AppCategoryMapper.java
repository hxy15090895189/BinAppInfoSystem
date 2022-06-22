package com.team.appInfoSystem.mapper;

import com.team.appInfoSystem.entity.AppCategory;
import com.team.appInfoSystem.entity.AppCategoryExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AppCategoryMapper {
    int countByExample(AppCategoryExample example);

    int deleteByExample(AppCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AppCategory record);

    int insertSelective(AppCategory record);

    List<AppCategory> selectByExample(AppCategoryExample example);

    AppCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AppCategory record, @Param("example") AppCategoryExample example);

    int updateByExample(@Param("record") AppCategory record, @Param("example") AppCategoryExample example);

    int updateByPrimaryKeySelective(AppCategory record);

    int updateByPrimaryKey(AppCategory record);

    @Select("select * from app_category where id = #{id}")
    AppCategory selectById(Long id);
}