package com.team.appInfoSystem.service.impl;

import com.team.appInfoSystem.entity.DataDictionary;
import com.team.appInfoSystem.entity.DataDictionaryExample;
import com.team.appInfoSystem.mapper.DataDictionaryMapper;
import com.team.appInfoSystem.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DictionaryServiceImpl implements DictionaryService {
    @Autowired
    private DataDictionaryMapper dataDictionaryMapper;
    @Override
    public List<DataDictionary> getAppStatue() {
        DataDictionaryExample dataDictionaryExample = new DataDictionaryExample();
        DataDictionaryExample.Criteria criteria = dataDictionaryExample.createCriteria();
        criteria.andTypenameEqualTo("APP状态");
        List<DataDictionary> dataDictionaries = dataDictionaryMapper.selectByExample(dataDictionaryExample);
        return dataDictionaries;
    }

    @Override
    public List<DataDictionary> getAppPingTai() {
        DataDictionaryExample dataDictionaryExample = new DataDictionaryExample();
        DataDictionaryExample.Criteria criteria = dataDictionaryExample.createCriteria();
        criteria.andTypenameEqualTo("所属平台");
        List<DataDictionary> dataDictionaries = dataDictionaryMapper.selectByExample(dataDictionaryExample);
        return dataDictionaries;
    }
}
