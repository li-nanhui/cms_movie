package com.linh.apps.cms_movie.web.controller;

import com.linh.apps.cms_movie.bean.User_Role;
import com.linh.apps.cms_movie.service.IUser_RoleService;
import com.linh.apps.cms_movie.utils.Message;
import com.linh.apps.cms_movie.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user_role")
public class User_RoleController {
    @Autowired
    private IUser_RoleService user_roleService;

    @GetMapping("findAll")
    public Message findAll(){
        List<User_Role> list = user_roleService.findAll();
        return MessageUtil.success(list);
    }

    @GetMapping("findById")
    public Message findById(long id){
        return MessageUtil.success(user_roleService.findById(id));
    }

    @PostMapping("saveOrUpdate")
    public Message saveOrUpdate(User_Role user_role){
        user_roleService.saveOrUpdate(user_role);
        return MessageUtil.success("更新成功");
    }

    @GetMapping("findByUserId")
    public Message findByUserId(long userId){
        List<User_Role> list = user_roleService.findByUserId(userId);
        return MessageUtil.success(list);
    }
}
