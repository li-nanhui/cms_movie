package com.linh.apps.cms_movie.dao.extend;

import com.linh.apps.cms_movie.bean.Role;
import com.linh.apps.cms_movie.bean.extend.RoleExtend;

import java.util.List;

/**
 * @author ：lnh
 * @date ：Created in 2019/11/17 15:22
 * @description：
 * @modified By：
 * @version:
 */
public interface RoleExtendMapper {
    List<Role> selectByUserId(long id);

    List<RoleExtend> selectAll();
}
