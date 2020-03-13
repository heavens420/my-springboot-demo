package com.example.demo.service.impl;

import com.example.demo.dao.UserDao;
import com.example.demo.dao.UserRoleDao;
import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import com.example.demo.entity.UserRole;
import com.example.demo.service.UserRoleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Transactional
@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Resource
    public UserRoleDao userRoleDao;

    @Resource
    public UserDao userDao;

    @Override
    public UserRole insertUserRole(User user, Role role) {
        UserRole userRole = new UserRole();
        userDao.insert(user);
        System.out.println("dao1111");
        userRoleDao.insertUserRole(user,role);
        System.out.println("ddao22222222");
        return userRole;
    }

    @Override
    public UserRole updateUserRole(String name, int id) {
        userRoleDao.updateUserRole(name,id);
        return null;
    }

    @Override
    public boolean deleteUserRole(int id) {
        return userRoleDao.deleteUserRole(id) > 0;
    }

    @Override
    public boolean batchDeleteUserRole(List<Integer> list) {
        return this.userRoleDao.batchDeleteUserRole(list) > 0;
    }
}
