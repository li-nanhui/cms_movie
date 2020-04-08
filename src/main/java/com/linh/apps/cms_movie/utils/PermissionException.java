package com.linh.apps.cms_movie.utils;

/**
 * @author ：lnh
 * @date ：Created in 2019/11/20 11:07
 * @description：权限异常
 * @modified By：
 * @version:
 */
public class PermissionException extends CustomerException{
    public PermissionException() {
    }

    public PermissionException(String message) {
        super(message);
    }

    public PermissionException(String message, Throwable cause) {
        super(message, cause);
    }

    public PermissionException(Throwable cause) {
        super(cause);
    }

    public PermissionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
