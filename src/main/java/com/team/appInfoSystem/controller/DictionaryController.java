package com.team.appInfoSystem.controller;

import com.team.appInfoSystem.entity.DataDictionary;
import com.team.appInfoSystem.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DictionaryController {

    @Autowired
    private DictionaryService dictionaryService;

    @RequestMapping("/getAppStatue")
    @ResponseBody
    public List<DataDictionary> getAppStaute(){
        List<DataDictionary> appStatue = dictionaryService.getAppStatue();
        return appStatue;
    }

    @RequestMapping("/getAppPing")
    @ResponseBody
    public List<DataDictionary> getAppPing(){
        List<DataDictionary> appStatue = dictionaryService.getAppPingTai();
        return appStatue;
    }

}
