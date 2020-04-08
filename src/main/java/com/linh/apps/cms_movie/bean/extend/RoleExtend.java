package com.linh.apps.cms_movie.bean.extend;

import com.linh.apps.cms_movie.bean.Privilege;
import com.linh.apps.cms_movie.bean.Role;

import java.util.List;

/**
 * @author ：lnh
 * @date ：Created in 2019/11/18 19:22
 * @description：角色拓展类
 * @modified By：
 * @version:
 */
public class RoleExtend extends Role {
    private List<Privilege> privileges;

    public List<Privilege> getPrivileges() {
        return privileges;
    }

    public void setPrivileges(List<Privilege> privileges) {
        this.privileges = privileges;
    }
}
