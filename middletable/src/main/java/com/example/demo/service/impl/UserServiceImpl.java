package com.example.demo.service.impl;

import com.example.demo.dao.UserRoleDao;
import com.example.demo.entity.User;
import com.example.demo.dao.UserDao;
import com.example.demo.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表服务实现类
 *
 * @author zhaolonglong
 * @since 2020-01-08 09:25:58
 */
@Transactional
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;

    @Resource
    private UserRoleDao userRoleDao;


    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public User queryById(Integer id) {
        return this.userDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<User> queryAllByLimit(int offset, int limit) {
        return this.userDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User insert(User user) {
        this.userDao.insert(user);
        return user;
    }

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User update(User user) {
        this.userDao.update(user);
        return this.queryById(user.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
//        删除用户的同时也要删除中间表
        this.userRoleDao.deleteUserRole(id);
        return this.userDao.deleteById(id) > 0;
    }

    @Override
    public List<User> queryAll() {
        return this.userDao.queryAll();
    }

    @Override
    public boolean deleteList(List<Integer> list) {
        //删除用户表的同时也要删除中间表
        this.userRoleDao.batchDeleteUserRole(list);
        return this.userDao.deleteList(list) > 0;
    }

    @Override
    public Long countAge(int age) {
        return userDao.countAge(age);
    }

    @Override
    public long countTotal() {
        return userDao.countTotal();
    }
}