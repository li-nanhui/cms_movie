package com.linh.apps.cms_movie.service.impl;

import com.linh.apps.cms_movie.bean.Role_Privilege;
import com.linh.apps.cms_movie.bean.Role_PrivilegeExample;
import com.linh.apps.cms_movie.dao.Role_PrivilegeMapper;
import com.linh.apps.cms_movie.service.IRole_PrivilegeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Role_PrivilegeServiceImpl implements IRole_PrivilegeService {
    @Resource
    private Role_PrivilegeMapper role_privilegeMapper;
    @Override
    public List<Role_Privilege> findAll() {
        return role_privilegeMapper.selectByExample(new Role_PrivilegeExample());
    }

    @Override
    public Role_Privilege findById(long id) {
        return role_privilegeMapper.selectByPrimaryKey(id);
    }

    @Override
    public void saveOrUpdate(Role_Privilege role_privilege) {
       if(role_privilege.getId()!=null){
           role_privilegeMapper.updateByPrimaryKey(role_privilege);
       }else {
           role_privilegeMapper.insert(role_privilege);
       }
    }
}
