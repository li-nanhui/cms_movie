package com.linh.apps.cms_movie.service;

import com.linh.apps.cms_movie.bean.Privilege;
import com.linh.apps.cms_movie.utils.CustomerException;
import com.linh.apps.cms_movie.vm.PrivilegeTree;

import java.util.List;

public interface IPrivilegeService {
    List<Privilege> findAll();

    List<Privilege> findByParentId(Long parentId);

    void saveOrUpdate(Privilege privilege)throws CustomerException;

    /**
     * @Description: 查询权限树
     * @Param: []
     * @return: java.util.List<com.linh.apps.cms_movie.vm.PrivilegeTree>
     * @Author:
     * @Date:
     */
    List<PrivilegeTree> findPrivilegeTree();

    /**
     * @Description: 查询用户所有权限
     * @Param: [id]
     * @return: java.util.List<com.linh.apps.cms_movie.bean.Privilege>
     * @Author: charles
     * @Date:
     */
    List<Privilege> findByUserId(long id);
}
