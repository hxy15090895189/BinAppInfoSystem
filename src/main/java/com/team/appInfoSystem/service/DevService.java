package com.team.appInfoSystem.service;

import com.team.appInfoSystem.entity.AppInfo;
import com.team.appInfoSystem.entity.DevUser;
import com.team.appInfoSystem.entity.AppInfoCondtion;

import java.util.List;

public interface DevService {
    List<DevUser> LoginUser(String devCode, String devPassword);

    List<AppInfo> selectAll(AppInfoCondtion appInfoCondtion);

}
