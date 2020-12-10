package com.ali.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Bank)实体类
 *
 * @author makejava
 * @since 2020-12-10 16:05:14
 */
@Data
public class Bank implements Serializable {
    private static final long serialVersionUID = 969014394408927494L;

    private Integer bankid;

    private String bankname;

    private String addr;

    private String banktel;

    private String time;


    public Integer getBankid() {
        return bankid;
    }

    public void setBankid(Integer bankid) {
        this.bankid = bankid;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getBanktel() {
        return banktel;
    }

    public void setBanktel(String banktel) {
        this.banktel = banktel;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

}