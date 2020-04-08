package com.linh.apps.cms_movie.dao.extend;

import com.linh.apps.cms_movie.bean.Privilege;
import com.linh.apps.cms_movie.vm.PrivilegeTree;

import java.util.List;

/**
 * @author ：lnh
 * @date ：Created in 2019/11/18 19:34
 * @description：权限的拓展文件
 * @modified By：
 * @version:
 */
public interface PrivilegeExtendMapper {
    List<PrivilegeTree> selectAll();

    List<Privilege> selectByParentId(long id);

    List<Privilege> selectByRoleId(long id);

    List<Privilege> selectByUserId(long id);
}
