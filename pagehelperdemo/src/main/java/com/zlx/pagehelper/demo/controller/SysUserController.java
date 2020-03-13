package com.zlx.pagehelper.demo.controller;

import com.zlx.pagehelper.demo.model.SysUser;
import com.zlx.pagehelper.demo.service.SysUserService;
import com.zlx.pagehelper.demo.util.PageRequest;
import com.zlx.pagehelper.demo.util.PageResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("user")
public class SysUserController {
    @Resource
    private SysUserService sysUserService;

    @GetMapping(value = "findAll" ,produces = {"application/json;charset=utf-8"})
    public List<SysUser> findAll(){
        return sysUserService.selectAll();
    }

    @GetMapping(value = "findPage" ,produces = {"application/json;charset=utf-8"})
    public PageResult findPage(PageRequest pageRequest){
//        pageRequest.setPageNum(2);
//        pageRequest.setPageSize(3);

        return sysUserService.selectPage(pageRequest);
    }
}
