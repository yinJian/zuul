package com.maimeng.gateway.zuul.config.exception;


import com.netflix.zuul.exception.ZuulException;

/**
 * @author wuweifeng wrote on 2017/10/27.
 */
public class NoLoginException extends ZuulException {

    public NoLoginException(Throwable throwable, String sMessage, int nStatusCode, String errorCause) {
        super(throwable, "没有权限", 401, errorCause);
    }

    public NoLoginException() {
        super("没有权限", 401, "");
    }
}
