package com.jtj.web.controller;

import com.jtj.web.common.ResultDto;
import com.jtj.web.service.SystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 首页控制层，路由跳转
 * Created by jiang (jiang.taojie@foxmail.com)
 * 2017/1/24 22:37 End.
 */
@Controller
public class IndexController {

    @Autowired
    private SystemService systemService;

    @GetMapping("/")
    public String all(){
        return "welcome";
    }

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }

    @GetMapping("/welcome")
    public String welcome(){
        return "welcome";
    }

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/init")
    public String init(HttpServletRequest request, HttpServletResponse response){
        return systemService.init(request,response);
    }
}
