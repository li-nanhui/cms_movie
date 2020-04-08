package com.linh.apps.cms_movie.vm;

import com.linh.apps.cms_movie.bean.Privilege;

import java.util.List;

/**
 * @program: cms_jd1911
 * @description: 权限树
 * @author: charles
 * @create: 2019-11-17 20:09
 **/

public class PrivilegeTree extends Privilege {
    private List<Privilege> children;

    public List<Privilege> getChildren() {
        return children;
    }

    public void setChildren(List<Privilege> children) {
        this.children = children;
    }
}
