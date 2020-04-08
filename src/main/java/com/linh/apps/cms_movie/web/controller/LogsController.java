package com.linh.apps.cms_movie.web.controller;

import com.linh.apps.cms_movie.bean.Logs;
import com.linh.apps.cms_movie.bean.extend.LogsExtend;
import com.linh.apps.cms_movie.service.ILogsService;
import com.linh.apps.cms_movie.utils.Message;
import com.linh.apps.cms_movie.utils.MessageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/logs")
public class LogsController {
    @Autowired
    private ILogsService logsService;

    @GetMapping("findAll")
    public Message findAll(){
        List<Logs> list = logsService.findAll();
        return MessageUtil.success(list);
    }

    @GetMapping("cascadeFindAll")
    public Message cascadeFindAll(){
        List<LogsExtend> list = logsService.cascadeFindAll();
        return MessageUtil.success(list);
    }

    @GetMapping("findById")
    public Message findById(long id){
        LogsExtend logsExtend = logsService.findById(id);
        return MessageUtil.success(logsExtend);
    }


    @PostMapping("saveOrUpdate")
    public Message saveOrUpdate(Logs logs){
        logsService.saveOrUpdate(logs);
        return MessageUtil.success("更新成功");
    }

    @GetMapping("deleteById")
    public Message deleteById(long id){
        logsService.deleteById(id);
        return MessageUtil.success("删除成功");
    }
}
