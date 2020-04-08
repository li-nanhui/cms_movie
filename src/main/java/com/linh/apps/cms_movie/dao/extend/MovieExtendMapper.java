package com.linh.apps.cms_movie.dao.extend;

import com.linh.apps.cms_movie.bean.extend.MovieExtend;

import java.util.List;

/**
 * @author ：lnh
 * @date ：Created in 2020/3/13 14:05
 * @description：
 * @modified By：
 * @version:
 */
public interface MovieExtendMapper {
    List<MovieExtend> selectAll();

    MovieExtend selectById(long id);
}
