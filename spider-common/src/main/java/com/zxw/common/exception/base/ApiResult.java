package com.zxw.common.exception.base;

import com.zxw.common.exception.enums.ExceptionEnums;

import java.time.LocalDateTime;

/**
 * @author zxw
 * @date 2020/6/25 17:24
 */

public class ApiResult {
    private Integer code;
    private String message;
    private LocalDateTime timestamp;

    public ApiResult(LocalDateTime timestamp) {
        this.timestamp = LocalDateTime.now();
    }

    public ApiResult(String message) {
        this.message = message;
    }

    public ApiResult(Integer code, String message, LocalDateTime timestamp) {
        this.code = code;
        this.message = message;
        this.timestamp = LocalDateTime.now();
    }

    public ApiResult(ExceptionEnums exceptionEnums) {
        this.code = exceptionEnums.getCode();
        this.message = exceptionEnums.getMsg();
        this.timestamp = LocalDateTime.now();
    }
}
