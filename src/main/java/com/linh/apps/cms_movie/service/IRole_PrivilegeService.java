package com.linh.apps.cms_movie.service;

import com.linh.apps.cms_movie.bean.Role_Privilege;

import java.util.List;

public interface IRole_PrivilegeService {
    List<Role_Privilege> findAll();

    Role_Privilege findById(long id);

    void saveOrUpdate(Role_Privilege role_privilege);
}
