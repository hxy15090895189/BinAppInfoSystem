package com.team.appInfoSystem.service.impl;

import com.team.appInfoSystem.entity.AppInfo;
import com.team.appInfoSystem.entity.DevUser;
import com.team.appInfoSystem.entity.DevUserExample;
import com.team.appInfoSystem.mapper.AppCategoryMapper;
import com.team.appInfoSystem.mapper.AppInfoMapper;
import com.team.appInfoSystem.mapper.DevUserMapper;
import com.team.appInfoSystem.service.DevService;
import com.team.appInfoSystem.entity.AppInfoCondtion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DevServiceImpl implements DevService {
    @Autowired
    private DevUserMapper devUserMapper;
    @Autowired
    private AppInfoMapper appInfoMapper;
    @Autowired
    private AppCategoryMapper appCategoryMapper;
    @Override
    public List<DevUser> LoginUser(String devCode, String devPassword) {
        DevUserExample u = new DevUserExample();
        DevUserExample.Criteria c = u.createCriteria();
        c.andDevcodeEqualTo(devCode);
        c.andDevpasswordEqualTo(devPassword);
        return devUserMapper.selectByExample(u);

    }

    @Override
    public List<AppInfo> selectAll(AppInfoCondtion appInfoCondtion) {
        List<AppInfo> list = appInfoMapper.selectLiang(appInfoCondtion);
        return list;
    }

}
