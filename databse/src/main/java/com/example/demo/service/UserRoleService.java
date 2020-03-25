package com.example.demo.service;

import com.example.demo.entity.Role;
import com.example.demo.entity.User;
import com.example.demo.entity.UserRole;

import java.util.List;

public interface UserRoleService {

    public UserRole insertUserRole(User user, Role role);

    public UserRole updateUserRole(String name, int id);

    public boolean deleteUserRole(int id);

    public boolean batchDeleteUserRole(List<Integer> list);
}
