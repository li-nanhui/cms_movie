package com.linh.apps.cms_movie.config;

import com.linh.apps.cms_movie.bean.Privilege;
import com.linh.apps.cms_movie.service.IPrivilegeService;
import com.linh.apps.cms_movie.utils.CustomerException;
import com.linh.apps.cms_movie.utils.JwtTokenUtil;
import com.linh.apps.cms_movie.utils.PermissionException;
import com.linh.apps.cms_movie.utils.UnAuthorizedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author ：lnh
 * @date ：Created in 2019/11/19 14:44
 * @description：jwt登陆认证 * @modified By：
 * @version:
 */
public class JwtInterceptor extends HandlerInterceptorAdapter {
    @Autowired
    private IPrivilegeService privilegeService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 如果是options请求，直接返回true，不进行拦截

        if (request.getMethod().equals("OPTIONS")) {
            response.setStatus(HttpServletResponse.SC_OK);
            System.out.println("是options请求，直接返回true，不进行拦截");
            return true;
        }
        // 获取请求头信息authorization信息
        final String token = request.getHeader(JwtTokenUtil.AUTH_HEADER_KEY);
        if (StringUtils.isEmpty(token)) {
            // throw new CustomerException("用户还未登录");
            throw new UnAuthorizedException("用户还未登录");
        }
        JwtTokenUtil.parseJWT(token, JwtTokenUtil.base64Secret);

        long id = Long.parseLong(JwtTokenUtil.getUserId(token, JwtTokenUtil.base64Secret));

        this.auth(id, request.getServletPath());

        return true;
    }


    //判断权限
    private boolean auth(long userId,String path){
        System.out.println("调用权限path:"+path);
        // 查询出该用户的所有权限
        List<Privilege> privileges = privilegeService.findByUserId(userId);
        // 匹配
        for(Privilege p : privileges){
          System.out.println(p.getRoute());

            String[] methods = p.getRoute().split("/");
            String[] res = path.split("/");

            if((res[1].equals(methods[1])&methods[2].equals("*"))||(p.getRoute().equals(path))){
                return true;
            }

//            if(p.getRoute().matches(path)){
//                return true;
//            }

        }
        throw new PermissionException("权限不足");

    }
}
