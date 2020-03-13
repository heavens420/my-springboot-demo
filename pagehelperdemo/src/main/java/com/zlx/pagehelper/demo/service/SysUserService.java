package com.zlx.pagehelper.demo.service;

import com.zlx.pagehelper.demo.model.SysUser;
import com.zlx.pagehelper.demo.util.PageRequest;
import com.zlx.pagehelper.demo.util.PageResult;

import java.util.List;

public interface SysUserService {

    List<SysUser> selectAll();

    PageResult selectPage(PageRequest pageRequest);
}
