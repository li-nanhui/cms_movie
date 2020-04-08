package com.linh.apps.cms_movie.service;

import com.linh.apps.cms_movie.bean.User_Role;

import java.util.List;

public interface IUser_RoleService {
    List<User_Role> findAll();

    User_Role findById(long id);

    void saveOrUpdate(User_Role user_role);

    List<User_Role> findByUserId(long id);
}
