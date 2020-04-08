package com.linh.apps.cms_movie.service;

import com.linh.apps.cms_movie.bean.Test;

import java.util.List;

public interface ITestService {

    void saveOrUpdate(Test test);

    List<Test> findAll();
}
