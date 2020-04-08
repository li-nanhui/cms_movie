package com.linh.apps.cms_movie.service.impl;

import com.linh.apps.cms_movie.bean.User;
import com.linh.apps.cms_movie.bean.UserExample;
import com.linh.apps.cms_movie.bean.User_Role;
import com.linh.apps.cms_movie.bean.User_RoleExample;
import com.linh.apps.cms_movie.bean.extend.UserExtend;
import com.linh.apps.cms_movie.dao.UserMapper;
import com.linh.apps.cms_movie.dao.User_RoleMapper;
import com.linh.apps.cms_movie.dao.extend.UserExtendMapper;
import com.linh.apps.cms_movie.service.IUserService;
import com.linh.apps.cms_movie.utils.CustomerException;
import com.linh.apps.cms_movie.vm.UserVM;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.linh.apps.cms_movie.config.TimeChange;

@Service
public class UserServiceImpl implements IUserService {
    @Resource
    private UserMapper userMapper;
    @Resource
    private UserExtendMapper userExtendMapper;
    @Resource
    private User_RoleMapper user_roleMapper;

    @Override
    public User login(UserVM userVM) throws CustomerException {
        UserExample example = new UserExample();
        example.createCriteria().andUsernameEqualTo(userVM.getUsername());
        List<User> list = userMapper.selectByExample(example);
        if(list.size()<=0){
            throw new CustomerException("该用户不存在");
        }
        User user = list.get(0);
        if(!user.getPassword().equals(userVM.getPassword())){
            throw new CustomerException("密码不匹配");
        }
        return user;

    }

    @Override
    public List<User> findAll() {
        return userMapper.selectByExample(new UserExample());
    }

    @Override
    public void saveOrUpdate(User user) throws CustomerException{
        if(user.getId()!=null){
            userMapper.updateByPrimaryKey(user);
        }else {
            //判断用户名是否被占用
            UserExample example = new UserExample();
            example.createCriteria().andUsernameEqualTo(user.getUsername());
            List<User> list = userMapper.selectByExample(example);
            if(list.size()>0){
                throw new CustomerException("该用户名已被占用");
            }
            //初始化
            TimeChange timeChange = new TimeChange();
            user.setRegisterTime(timeChange.timeStampToDate(new Date().getTime()));

            user.setBirth(timeChange.timeStampToDate(Long.parseLong(user.getBirth())));

            user.setStatus(UserExtend.STATUS_NORMAL);
            userMapper.insert(user);
        }
    }

    @Override
    public List<UserExtend> cascadeFindAll() {
        return userExtendMapper.selectAll();
    }

    @Override
    public void deleteById(long id) throws CustomerException{
        User user=this.findById(id);
        if(user==null){
            throw new CustomerException("该用户不存在");
        }
        userMapper.deleteByPrimaryKey(id);

    }

    @Override
    public UserExtend findById(long id) {
        return userExtendMapper.selectById(id);
    }

    @Override
    public void setRoles(long id, List<Long> roles) {
        //根据userid查询自己的角色
        User_RoleExample example = new User_RoleExample();
        example.createCriteria().andUserIdEqualTo(id);
        //用户角色关系，获取所有老的角色
        List<User_Role> list = user_roleMapper.selectByExample(example);
        List<Long> oldRole = new ArrayList<>();
        Iterator<User_Role> iterator = list.iterator();
        while (iterator.hasNext()){
            oldRole.add(iterator.next().getRoleId());
        }
        // [1,2,3] -> [3,4] 添加1,2 => [1,2,3,4]
        // 依次判断新角色是否存在于list中，如果不存在则添加
        for(Long roleId:roles){
            if(!oldRole.contains(roleId)){
                User_Role user_role = new User_Role();
                user_role.setRoleId(roleId);
                user_role.setUserId(id);
                user_roleMapper.insert(user_role);
            }
        }
        // [1,2,3] -> [1,2,3,4]   删除 3,4  => [1,2]
        // 依次判断老的角色是否存在于roles中，如果不存在则删除
        for(User_Role userRole : list){
            if(!roles.contains(userRole.getRoleId())){
                User_RoleExample example1 = new User_RoleExample();
                user_roleMapper.deleteByPrimaryKey(userRole.getId());
            }
        }
    }
}
