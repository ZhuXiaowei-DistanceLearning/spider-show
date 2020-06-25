package com.zxw.system.domain;

/**
 * @author zxw
 * @date 2020/6/25 18:49
 */
public class SysUser {
    private String ip;
    private Integer id;
    private String name;
    private String status;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
