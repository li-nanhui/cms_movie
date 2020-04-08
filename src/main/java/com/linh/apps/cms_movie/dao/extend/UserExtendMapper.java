package com.linh.apps.cms_movie.dao.extend;

import com.linh.apps.cms_movie.bean.extend.UserExtend;

import java.util.List;

public interface UserExtendMapper {
    UserExtend selectById(long id);

    List<UserExtend> selectAll();

}
