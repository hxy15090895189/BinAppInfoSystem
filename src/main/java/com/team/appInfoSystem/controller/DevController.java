package com.team.appInfoSystem.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.team.appInfoSystem.entity.AppInfo;
import com.team.appInfoSystem.entity.AppInfoCondtion;
import com.team.appInfoSystem.entity.DevUser;
import com.team.appInfoSystem.service.DevService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/dev/")
public class DevController {
    @Autowired
    private DevService devService;

    @RequestMapping("Login")
    public String Login(String devCode, String devPassword, Model model, HttpSession session){

        List<DevUser> list = devService.LoginUser(devCode, devPassword);
        if (list.size()>=1){
            session.setAttribute("list",list);
            model.addAttribute("user",list);
            return "jsp/developer/main";
        }else {
            return "jsp/403";
        }

    }
    @RequestMapping("ListAll")
    public ModelAndView getAll(ModelAndView mav, @RequestParam(defaultValue = "1") Integer currPage, @RequestParam(defaultValue = "3") Integer pageSize, AppInfoCondtion appInfoCondtion){
        System.out.println(appInfoCondtion);
        PageHelper.startPage(currPage,pageSize);
        List<AppInfo> list = devService.selectAll(appInfoCondtion);
        for (AppInfo appInfo : list) {
            System.out.println(appInfo);
        }
        PageInfo<AppInfo> pageInfo = new PageInfo<>(list);
        mav.addObject("list",list);
        mav.addObject("pageInfo",pageInfo);
        mav.setViewName("jsp/developer/show");
        return mav;
    }



}
