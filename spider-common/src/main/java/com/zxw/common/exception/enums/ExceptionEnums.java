package com.zxw.common.exception.enums;

import java.time.LocalDateTime;

/**
 * @author zxw
 * @date 2020/6/25 17:18
 */
public enum ExceptionEnums {
    BAD_REQUESTION_EXCEPTION(400, "服务器错误");
    private Integer code;
    private String msg;

    ExceptionEnums(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
