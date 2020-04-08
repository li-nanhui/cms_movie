package com.linh.apps.cms_movie.service.impl;

import com.linh.apps.cms_movie.bean.User_Role;
import com.linh.apps.cms_movie.bean.User_RoleExample;
import com.linh.apps.cms_movie.dao.RoleMapper;
import com.linh.apps.cms_movie.dao.User_RoleMapper;
import com.linh.apps.cms_movie.service.IUser_RoleService;
import com.linh.apps.cms_movie.utils.CustomerException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class User_RoleServiceImpl implements IUser_RoleService {
    @Resource
    private User_RoleMapper user_roleMapper;
    @Override
    public List<User_Role> findAll() {
        return user_roleMapper.selectByExample(new User_RoleExample());
    }

    @Override
    public User_Role findById(long id) {
        return user_roleMapper.selectByPrimaryKey(id);
    }

    @Override
    public void saveOrUpdate(User_Role user_role) {
        //如果用户已有该角色 则插入不成功
        List<User_Role> list = user_roleMapper.selectByUserId(user_role.getUserId());
        List list1 = new ArrayList();
        for(User_Role role : list){
            list1.add(role.getRoleId());
        }
        if(user_role.getId()==null){
            if(list==null || (!list1.contains(user_role.getRoleId()))) {
                user_roleMapper.insert(user_role);
            }else {
               throw new CustomerException("用户已获得该角色");
            }
        }else {
            user_roleMapper.updateByPrimaryKey(user_role);
        }
    }

    @Override
    public List<User_Role> findByUserId(long id) {
        return user_roleMapper.selectByUserId(id);
    }
}
