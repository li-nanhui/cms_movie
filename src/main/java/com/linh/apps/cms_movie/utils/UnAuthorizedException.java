package com.linh.apps.cms_movie.utils;

/**
 * @author ：lnh
 * @date ：Created in 2019/11/20 13:56
 * @description：未授权异常
 * @modified By：
 * @version:
 */
public class UnAuthorizedException extends CustomerException{
    public UnAuthorizedException() {
    }

    public UnAuthorizedException(String message) {
        super(message);
    }

    public UnAuthorizedException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnAuthorizedException(Throwable cause) {
        super(cause);
    }

    public UnAuthorizedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
