package com.bank.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * (Asset)实体类
 *
 * @author makejava
 * @since 2020-12-10 16:05:09
 */
@Data
public class Asset implements Serializable {
    private static final long serialVersionUID = -38313477397070539L;

    private Integer assetid;

    private Integer userid;

    private Integer bcid;

    private Integer irid;

    private Object assmoney;

    private String bak1;

    private String bak2;

    private String bak3;


    public Integer getAssetid() {
        return assetid;
    }

    public void setAssetid(Integer assetid) {
        this.assetid = assetid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getBcid() {
        return bcid;
    }

    public void setBcid(Integer bcid) {
        this.bcid = bcid;
    }

    public Integer getIrid() {
        return irid;
    }

    public void setIrid(Integer irid) {
        this.irid = irid;
    }

    public Object getAssmoney() {
        return assmoney;
    }

    public void setAssmoney(Object assmoney) {
        this.assmoney = assmoney;
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