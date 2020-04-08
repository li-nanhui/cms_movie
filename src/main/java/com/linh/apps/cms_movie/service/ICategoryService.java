package com.linh.apps.cms_movie.service;

import com.linh.apps.cms_movie.bean.Category;
import com.linh.apps.cms_movie.utils.CustomerException;

import java.util.List;

/**
 * @author ：lnh
 * @date ：Created in 2020/3/16 10:13
 * @description：
 * @modified By：
 * @version:
 */
public interface ICategoryService {
    List<Category> findAll();

    void saveOrUpdate(Category category) throws CustomerException;

    void deleteById(long id) throws CustomerException;

    void batchDelete(long[] ids) throws CustomerException;
}
