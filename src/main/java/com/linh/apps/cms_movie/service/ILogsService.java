package com.linh.apps.cms_movie.service;

import com.linh.apps.cms_movie.bean.Logs;
import com.linh.apps.cms_movie.bean.extend.LogsExtend;
import com.linh.apps.cms_movie.utils.CustomerException;

import java.util.List;

public interface ILogsService {

    List<Logs> findAll();

    List<LogsExtend> cascadeFindAll();

    LogsExtend findById(long id);

    void saveOrUpdate(Logs logs)throws CustomerException;

    void deleteById(long id);

}
