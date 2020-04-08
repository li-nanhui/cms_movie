package com.linh.apps.cms_movie.web.controller;

import com.linh.apps.cms_movie.bean.Role_Privilege;
import com.linh.apps.cms_movie.service.IRole_PrivilegeService;
import com.linh.apps.cms_movie.utils.Message;
import com.linh.apps.cms_movie.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/role_privilege")
public class Role_PrivilegeController {
    @Autowired
    private IRole_PrivilegeService role_privilegeService;

    @GetMapping("findAll")
    public Message findAll(){
        List<Role_Privilege> list = role_privilegeService.findAll();
        return MessageUtil.success(list);
    }

    @GetMapping("findById")
    public Message findById(long id){
        Role_Privilege role_privilege = role_privilegeService.findById(id);
       return MessageUtil.success(role_privilege);
    }

    @PostMapping("saveOrUpdate")
    public Message saveOrUpdate(Role_Privilege role_privilege){
        role_privilegeService.saveOrUpdate(role_privilege);
        return MessageUtil.success("更新成功");
    }
}
