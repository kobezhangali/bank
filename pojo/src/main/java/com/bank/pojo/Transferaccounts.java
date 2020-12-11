package com.bank.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * (Transferaccounts)实体类
 *
 * @author makejava
 * @since 2020-12-10 16:05:24
 */
@Data
public class Transferaccounts implements Serializable {
    private static final long serialVersionUID = 435923547561950054L;

    private Integer taid;

    private Integer bcid;

    private String tastatus;

    private String bak1;

    private String bak2;

    private String bak3;


    public Integer getTaid() {
        return taid;
    }

    public void setTaid(Integer taid) {
        this.taid = taid;
    }

    public Integer getBcid() {
        return bcid;
    }

    public void setBcid(Integer bcid) {
        this.bcid = bcid;
    }

    public String getTastatus() {
        return tastatus;
    }

    public void setTastatus(String tastatus) {
        this.tastatus = tastatus;
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