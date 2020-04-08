package com.linh.apps.cms_movie.service;

import com.linh.apps.cms_movie.bean.Role;
import com.linh.apps.cms_movie.bean.extend.RoleExtend;
import com.linh.apps.cms_movie.utils.CustomerException;

import java.util.List;

public interface IRoleService {
    List<Role> findAll();

    void saveOrUpdate(Role role)throws CustomerException;

    List<RoleExtend>  cascadePrivilegeFindAll();

    void deleteById(long id) throws CustomerException;

    void authorization(long roleId, List<Long> privilegeIds);

}
