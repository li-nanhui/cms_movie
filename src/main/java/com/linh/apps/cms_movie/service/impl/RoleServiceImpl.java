package com.linh.apps.cms_movie.service.impl;

import com.linh.apps.cms_movie.bean.Role;
import com.linh.apps.cms_movie.bean.RoleExample;
import com.linh.apps.cms_movie.bean.Role_Privilege;
import com.linh.apps.cms_movie.bean.Role_PrivilegeExample;
import com.linh.apps.cms_movie.bean.extend.RoleExtend;
import com.linh.apps.cms_movie.dao.RoleMapper;
import com.linh.apps.cms_movie.dao.Role_PrivilegeMapper;
import com.linh.apps.cms_movie.dao.extend.RoleExtendMapper;
import com.linh.apps.cms_movie.service.IRoleService;
import com.linh.apps.cms_movie.utils.CustomerException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService {
    @Resource
    private RoleMapper roleMapper;
    @Resource
    private RoleExtendMapper roleExtendMapper;
    @Resource
    private Role_PrivilegeMapper role_privilegeMapper;
    @Override
    public List<Role> findAll() {
        return roleMapper.selectByExample(new RoleExample());
    }

    @Override
    public void saveOrUpdate(Role role) throws CustomerException{
        if(role.getId()!=null){
            roleMapper.updateByPrimaryKey(role);
        } else {
            roleMapper.insert(role);
        }
    }

    @Override
    public List<RoleExtend> cascadePrivilegeFindAll() {
        return roleExtendMapper.selectAll();
    }

    @Override
    public void deleteById(long id) throws CustomerException {
        Role role = roleMapper.selectByPrimaryKey(id);
        if(role == null){
            throw new CustomerException("要删除的角色不存在");
        }
        roleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void authorization(long roleId, List<Long> privilegeIds) {
        //根据roleId查询出所有的权限
        Role_PrivilegeExample example = new Role_PrivilegeExample();
        example.createCriteria().andPrivilegeIdEqualTo(roleId);
        List<Role_Privilege> list = role_privilegeMapper.selectByExample(example);
        //将list转为privilegeId的集合
        List<Long> old_privilegeIds = new ArrayList<>();
        for(Role_Privilege rp : list){
           // System.out.println("已有权限："+rp.getPrivilegeId());
            old_privilegeIds.add(rp.getPrivilegeId());
        }
        //依此判断privilegeIds是否存在于old_privilegeIds，如果不存在则插入
        for(long privilegeId : privilegeIds){
            if(!old_privilegeIds.contains(privilegeId)){
                Role_Privilege rp = new Role_Privilege();
                rp.setRoleId(roleId);
                rp.setPrivilegeId(privilegeId);
                role_privilegeMapper.insert(rp);
            }
        }
        //依此判断 old_privilegeIds是否存在于privilegeIds 如果不存在则删除
        for(long privilegeId : old_privilegeIds){
            if(!privilegeIds.contains(privilegeId)){
                example.clear();
                example.createCriteria()
                        .andRoleIdEqualTo(roleId)
                        .andPrivilegeIdEqualTo(privilegeId);
                role_privilegeMapper.deleteByExample(example);
            }
        }
    }
}
