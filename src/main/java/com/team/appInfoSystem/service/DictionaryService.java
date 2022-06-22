package com.team.appInfoSystem.service;

import com.team.appInfoSystem.entity.DataDictionary;

import java.util.List;

public interface DictionaryService {
    //查询状态
    List<DataDictionary> getAppStatue();
    //查询平台
    List<DataDictionary> getAppPingTai();
}
