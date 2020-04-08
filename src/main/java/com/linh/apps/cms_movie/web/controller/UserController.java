package com.linh.apps.cms_movie.web.controller;

import com.linh.apps.cms_movie.bean.User;
import com.linh.apps.cms_movie.bean.extend.UserExtend;
import com.linh.apps.cms_movie.service.IUserService;
import com.linh.apps.cms_movie.utils.JwtTokenUtil;
import com.linh.apps.cms_movie.utils.Message;
import com.linh.apps.cms_movie.utils.MessageUtil;
import com.linh.apps.cms_movie.vm.UserRoleVM;
import com.linh.apps.cms_movie.vm.UserVM;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
用户控制器类
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @PostMapping("login")
    public Message login(
            @RequestBody UserVM userVM){
        //1.认证用户名和密码
        User user = userService.login(userVM);
        //2.如果登陆成功产生token，将token缓存起来，返回
        String token = JwtTokenUtil.createJWT(user.getId(), user.getUsername());
        //3.如果登陆失败
        Map<String,String> map=new HashMap<>();
        //map.put("token","admin-token");
        map.put("token",token);
        return MessageUtil.success(map);
    }

    @ApiOperation("通过token获取用户的基本信息")
    @GetMapping("info")
    public Message info(String token){
        //1.通过token获取用户信息  {id,user,gender,roles:[]}
//       UserExtend userExtend = userService.findById(1l);
        long id = Long.parseLong(JwtTokenUtil.getUserId(token,JwtTokenUtil.base64Secret));
        UserExtend userExtend = userService.findById(id);
        return MessageUtil.success(userExtend);
    }

    @PostMapping("logout")
    public Message logOut(){
        //1.从缓存中移除token
        return MessageUtil.success("退出成功");
    }



    @ApiOperation(value ="查询所有",notes = "级联用户角色")
    @GetMapping("cascadeRoleFindAll")
    public Message cascadeRoleFindAll(){
        List<UserExtend> list = userService.cascadeFindAll();
        return MessageUtil.success(list);
    }
    @ApiOperation(value ="查询所有")
    @GetMapping("findAll")
    public Message findAll(){
        List<User> list = userService.findAll();
        return MessageUtil.success(list);
    }
    @ApiOperation(value ="保存或更新")
    @PostMapping("saveOrUpdate")
    public Message saveOrUpdate(User user){
        userService.saveOrUpdate(user);
        return MessageUtil.success("更新成功");
    }

    @ApiOperation(value ="设置角色")
    @PostMapping("setRoles")
    public Message setRoles(UserRoleVM userRoleVM){
        System.out.println(userRoleVM);
        userService.setRoles(userRoleVM.getId(),userRoleVM.getRoles());
        return MessageUtil.success("设置成功");
    }


    @GetMapping("findById")
    public Message findById(long id){
        User user = userService.findById(id);
        return MessageUtil.success(user);
    }

    @GetMapping("deleteById")
    public Message deleteById(long id){
        userService.deleteById(id);
        return MessageUtil.success("移除成功");
    }

}
