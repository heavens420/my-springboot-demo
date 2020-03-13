package com.zlx.shiro.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OtherController {

    @GetMapping("/h1")
    public String toH1(){
        return "h1";
    }

    @GetMapping("/h2")
    public String toH2(){
        return "h2";
    }

    @RequestMapping("/success")
    public String toSuccess(){
        return "success";
    }

    @RequestMapping("/p1")
    @ResponseBody
    @RequiresPermissions("user:query")
    public String toP1(){
        return "P1";
    }
}
