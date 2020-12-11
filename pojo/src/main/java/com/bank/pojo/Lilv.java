package com.bank.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * (Lilv)实体类
 *
 * @author makejava
 * @since 2020-12-10 16:05:20
 */
@Data
public class Lilv implements Serializable {
    private static final long serialVersionUID = -84133701214053406L;

    private Integer irid;

    private String irtype;

    private Object irmoney;

    private String irtime;

    private String lilv;

    private String bak1;

    private String bak2;

    private String bak3;


    public Integer getIrid() {
        return irid;
    }

    public void setIrid(Integer irid) {
        this.irid = irid;
    }

    public String getIrtype() {
        return irtype;
    }

    public void setIrtype(String irtype) {
        this.irtype = irtype;
    }

    public Object getIrmoney() {
        return irmoney;
    }

    public void setIrmoney(Object irmoney) {
        this.irmoney = irmoney;
    }

    public String getIrtime() {
        return irtime;
    }

    public void setIrtime(String irtime) {
        this.irtime = irtime;
    }

    public String getLilv() {
        return lilv;
    }

    public void setLilv(String lilv) {
        this.lilv = lilv;
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