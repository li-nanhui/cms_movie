package com.linh.apps.cms_movie.web.controller;

import com.linh.apps.cms_movie.bean.Privilege;
import com.linh.apps.cms_movie.service.IPrivilegeService;
import com.linh.apps.cms_movie.utils.CustomerException;
import com.linh.apps.cms_movie.utils.Message;
import com.linh.apps.cms_movie.utils.MessageUtil;
import com.linh.apps.cms_movie.vm.PrivilegeTree;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/privilege")
public class PrivilegeController {
    @Autowired
    private IPrivilegeService privilegeService;

    @ApiOperation(value = "查询所有")
    @GetMapping("findAll")
    public Message findAll(){
        List<Privilege> list = privilegeService.findAll();
        return MessageUtil.success(list);
    }

    @ApiOperation(value = "通过parentId查询")
    @GetMapping("findByParentId")
    public Message findByParentId(Long id){
        List<Privilege> list = privilegeService.findByParentId(id);
        return MessageUtil.success(list);
    }

    @ApiOperation(value = "查询树")
    @GetMapping("findPrivilegeTree")
    public Message findPrivilegeTree(){
        List<PrivilegeTree> list = privilegeService.findPrivilegeTree();
        return MessageUtil.success(list);
    }

    @ApiOperation(value ="保存或更新")
    @PostMapping("saveOrUpdate")
    public Message saveOrUpdate(Privilege privilege)throws CustomerException {
        privilegeService.saveOrUpdate(privilege);
        return MessageUtil.success("更新成功");
    }

}
