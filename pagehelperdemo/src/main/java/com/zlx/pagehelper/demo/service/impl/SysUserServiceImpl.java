package com.zlx.pagehelper.demo.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zlx.pagehelper.demo.model.SysUser;
import com.zlx.pagehelper.demo.service.SysUserService;
import com.zlx.pagehelper.demo.util.PageRequest;
import com.zlx.pagehelper.demo.util.PageResult;
import com.zlx.pagehelper.demo.util.PageUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private com.zlx.pagehelper.demo.mapper.SysUserMapper sysUserMapper;

    @Override
    public List<SysUser> selectAll() {
        return sysUserMapper.selectAll();
    }

    @Override
    public PageResult selectPage(PageRequest pageRequest) {
        return PageUtils.getPageResult(pageRequest,getPageInfo(pageRequest));
//        PageResult pageResult = new PageResult();
//        pageResult.setStatus(true);
//        pageResult.setMsg("success");
//        pageResult.setContent(getPageInfo(pageRequest));
//        return pageResult;
    }

//    调用分页插件
    private PageInfo<SysUser> getPageInfo(PageRequest pageRequest){
        int pageNum =pageRequest.getPageNum();
        int pageSize = pageRequest.getPageSize();
        PageHelper.startPage(pageNum,pageSize);
        List<SysUser> list = sysUserMapper.selectPage(pageRequest);
        return new PageInfo<SysUser>(list);
    }
}
