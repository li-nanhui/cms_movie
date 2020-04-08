package com.linh.apps.cms_movie.service;

import com.linh.apps.cms_movie.bean.User;
import com.linh.apps.cms_movie.bean.extend.UserExtend;
import com.linh.apps.cms_movie.utils.CustomerException;
import com.linh.apps.cms_movie.vm.UserVM;

import java.util.List;

public interface IUserService {
    List<User> findAll();

    List<UserExtend> cascadeFindAll();
    /**
     * @Description: 登录
     * @Param: [userVM]
     * @return: void
     * @Author:
     * @Date: 2019-11-18
     */
    User login(UserVM userVM) throws CustomerException;

    void deleteById(long id)throws CustomerException;

    void saveOrUpdate(User user)throws CustomerException;

    UserExtend findById(long id);

    void setRoles(long id, List<Long> roles);
}
