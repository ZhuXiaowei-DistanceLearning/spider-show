package com.zxw.common.enums;

/**
 * @author zxw
 * @date 2020/6/25 18:08
 */
public enum UserStatus {
    DISABLE("1", "停用");
    private String code;
    private String info;

    UserStatus(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
