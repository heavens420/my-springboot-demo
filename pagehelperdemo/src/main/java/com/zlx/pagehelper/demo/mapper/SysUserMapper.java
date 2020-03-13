package com.zlx.pagehelper.demo.mapper;

import com.zlx.pagehelper.demo.model.SysUser;
import com.zlx.pagehelper.demo.util.PageRequest;
import com.zlx.pagehelper.demo.util.PageResult;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface SysUserMapper {

    List<SysUser> selectAll();

    List<SysUser> selectPage(PageRequest pageRequest);
}
