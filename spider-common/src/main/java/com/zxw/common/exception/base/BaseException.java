package com.zxw.common.exception.base;

import com.zxw.common.exception.enums.ExceptionEnums;

/**
 * @author zxw
 * @date 2020/6/25 17:00
 */
public class BaseException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private ExceptionEnums exceptionEnums;

    public ExceptionEnums getExceptionEnums() {
        return exceptionEnums;
    }

    public void setExceptionEnums(ExceptionEnums exceptionEnums) {
        this.exceptionEnums = exceptionEnums;
    }
}
