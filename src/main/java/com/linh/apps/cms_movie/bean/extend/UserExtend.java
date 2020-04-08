package com.linh.apps.cms_movie.bean.extend;

import com.linh.apps.cms_movie.bean.Role;
import com.linh.apps.cms_movie.bean.User;

import java.util.List;

/*
用户拓展类
 */
public class UserExtend extends User {
    public static final String STATUS_NORMAL="正常";
    public static final String STATUS_FORBIDDEN="禁用";

    private List<Role> roles;

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
