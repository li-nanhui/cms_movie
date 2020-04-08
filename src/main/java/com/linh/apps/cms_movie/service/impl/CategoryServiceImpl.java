package com.linh.apps.cms_movie.service.impl;

import com.linh.apps.cms_movie.bean.Category;
import com.linh.apps.cms_movie.bean.CategoryExample;
import com.linh.apps.cms_movie.dao.CategoryMapper;
import com.linh.apps.cms_movie.service.ICategoryService;
import com.linh.apps.cms_movie.utils.CustomerException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ：lnh
 * @date ：Created in 2020/3/16 10:14
 * @description：
 * @modified By：
 * @version:
 */
@Service
public class CategoryServiceImpl implements ICategoryService {
    @Resource
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> findAll() {
        return categoryMapper.selectByExample(new CategoryExample());
    }

    @Override
    public void saveOrUpdate(Category category) throws CustomerException {
        if (category.getId() != null) {
            categoryMapper.updateByPrimaryKey(category);
        } else {
            //判断是否重名
            CategoryExample example = new CategoryExample();
            example.createCriteria().andNameEqualTo(category.getName());
            List<Category> list = categoryMapper.selectByExample(example);
            if (list.size() > 0) {
                throw new CustomerException("该栏目已经存在");
            }
            categoryMapper.insert(category);
        }
    }

    @Override
    public void deleteById(long id) throws CustomerException {
        Category category = categoryMapper.selectByPrimaryKey(id);
        if (category == null) {
            throw new CustomerException("要删除的栏目不存在");
        }
        categoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional //声明式事务管理 基于 Spring 的动态代理的机制
    public void batchDelete(long[] ids) throws CustomerException {
        for (long id : ids) {
            this.deleteById(id);
        }
    }
}
