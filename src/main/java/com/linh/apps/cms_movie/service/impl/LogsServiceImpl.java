package com.linh.apps.cms_movie.service.impl;

import com.linh.apps.cms_movie.bean.Logs;
import com.linh.apps.cms_movie.bean.LogsExample;
import com.linh.apps.cms_movie.bean.extend.LogsExtend;
import com.linh.apps.cms_movie.config.TimeChange;
import com.linh.apps.cms_movie.dao.LogsMapper;
import com.linh.apps.cms_movie.dao.extend.LogsExtendMapper;
import com.linh.apps.cms_movie.service.ILogsService;
import com.linh.apps.cms_movie.utils.CustomerException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class LogsServiceImpl implements ILogsService {
    @Resource
    private LogsMapper logsMapper;
    @Resource
    private LogsExtendMapper logsExtendMapper;

    @Override
    public List<Logs> findAll() {
        return logsMapper.selectByExample(new LogsExample());
    }

    @Override
    public List<LogsExtend> cascadeFindAll() {
        return logsExtendMapper.selectAll();
    }

    @Override
    public LogsExtend findById(long id) {
        return logsExtendMapper.selectById(id);
    }

    @Override
    public void saveOrUpdate(Logs logs) throws CustomerException {
        if(logs.getId()!=null){
            logsMapper.updateByPrimaryKey(logs);
        } else {
            // 标题不能重名
            LogsExample example = new LogsExample();
            example.createCriteria().andTittleEqualTo(logs.getTittle());

            List<Logs> list = logsMapper.selectByExample(example);
            if(list.size()>0){
                throw new CustomerException("标题不能重复");
            }else {

                // 初始化
                TimeChange timeChange = new TimeChange();
                logs.setActionTime(timeChange.timeStampToDate(new Date().getTime()));
                logsMapper.insert(logs);
            }
        }
    }

    @Override
    public void deleteById(long id) {
        logsMapper.deleteByPrimaryKey(id);
    }
}
