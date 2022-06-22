package com.team.appInfoSystem.mapper;

import com.team.appInfoSystem.entity.AppInfo;
import com.team.appInfoSystem.entity.AppInfoExample;
import com.team.appInfoSystem.entity.AppInfoCondtion;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface AppInfoMapper {
    int countByExample(AppInfoExample example);

    int deleteByExample(AppInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AppInfo record);

    int insertSelective(AppInfo record);

    List<AppInfo> selectByExample(AppInfoExample example);

    AppInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AppInfo record, @Param("example") AppInfoExample example);

    int updateByExample(@Param("record") AppInfo record, @Param("example") AppInfoExample example);

    int updateByPrimaryKeySelective(AppInfo record);

    int updateByPrimaryKey(AppInfo record);

    List<AppInfo> selectLiang(AppInfoCondtion appInfoCondtion);
}