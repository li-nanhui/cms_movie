package com.linh.apps.cms_movie.service.impl;

import com.linh.apps.cms_movie.bean.Test;
import com.linh.apps.cms_movie.bean.TestExample;
import com.linh.apps.cms_movie.dao.TestMapper;
import com.linh.apps.cms_movie.service.ITestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: cms_jd1911
 * @description: 测试业务类
 * @author: charles
 * @create: 2019-11-11 12:22
 **/
@Service  //声明为业务逻辑类
public class TestServiceImpl implements ITestService {

    @Resource  //注入
    private TestMapper testMapper;

    @Override
    public void saveOrUpdate(Test test) {
        if(test.getId()!=null){
            testMapper.updateByPrimaryKey(test);
        } else {
            testMapper.insert(test);
        }
    }

    @Override
    public List<Test> findAll() {
        TestExample example = new TestExample();
        return testMapper.selectByExample(example);
    }
}
