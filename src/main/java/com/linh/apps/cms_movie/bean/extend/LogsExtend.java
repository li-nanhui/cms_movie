package com.linh.apps.cms_movie.bean.extend;

import com.linh.apps.cms_movie.bean.Logs;
import com.linh.apps.cms_movie.bean.User;

public class LogsExtend extends Logs {
    private User user;

    public User getUser(){
        return user;
    }
    public void setUser(User user){
        this.user=user;
    }
}
