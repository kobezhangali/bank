package com.bank.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * (Bill)实体类
 *
 * @author makejava
 * @since 2020-12-10 16:05:17
 */
@Data
public class Bill implements Serializable {
    private static final long serialVersionUID = 456036052225292607L;

    private Integer billid;

    private Integer userid;

    private Object billmoney;

    private String inorout;

    private String idcard;

    private String outdate;

    private String indate;

    private String bak1;

    private String bak2;

    private String bak3;


    public Integer getBillid() {
        return billid;
    }

    public void setBillid(Integer billid) {
        this.billid = billid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Object getBillmoney() {
        return billmoney;
    }

    public void setBillmoney(Object billmoney) {
        this.billmoney = billmoney;
    }

    public String getInorout() {
        return inorout;
    }

    public void setInorout(String inorout) {
        this.inorout = inorout;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getOutdate() {
        return outdate;
    }

    public void setOutdate(String outdate) {
        this.outdate = outdate;
    }

    public String getIndate() {
        return indate;
    }

    public void setIndate(String indate) {
        this.indate = indate;
    }

    public String getBak1() {
        return bak1;
    }

    public void setBak1(String bak1) {
        this.bak1 = bak1;
    }

    public String getBak2() {
        return bak2;
    }

    public void setBak2(String bak2) {
        this.bak2 = bak2;
    }

    public String getBak3() {
        return bak3;
    }

    public void setBak3(String bak3) {
        this.bak3 = bak3;
    }

}