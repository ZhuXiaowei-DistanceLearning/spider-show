package com.zxw.framework.secuirty.web.filter.captcha;

import org.apache.shiro.web.filter.AccessControlFilter;

/**
 * @author zxw
 * @date 2020/6/25 18:24
 */
public class CaptchaValidateFilter extends AccessControlFilter {

    @Override
    public boolean onPreHandle(javax.servlet.ServletRequest request, javax.servlet.ServletResponse response, Object mappedValue) throws Exception {
        return super.onPreHandle(request, response, mappedValue);
    }

    protected boolean isAccessAllowed(javax.servlet.ServletRequest servletRequest, javax.servlet.ServletResponse servletResponse, Object o) throws Exception {
        return false;
    }

    protected boolean onAccessDenied(javax.servlet.ServletRequest servletRequest, javax.servlet.ServletResponse servletResponse) throws Exception {
        return false;
    }
}
