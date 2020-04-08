package com.linh.apps.cms_movie.dao.extend;

import com.linh.apps.cms_movie.bean.extend.LogsExtend;

import java.util.List;

public interface LogsExtendMapper {

    List<LogsExtend> selectAll();

    LogsExtend selectById(long id);
}