package com.ali.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Loansinfo)实体类
 *
 * @author makejava
 * @since 2020-12-10 16:05:22
 */
@Data
public class Loansinfo implements Serializable {
    private static final long serialVersionUID = -55366876030263715L;

    private Integer ldid;

    private Integer irid;

    private Integer bcid;

    private String refoundcard;

    private String refoundbank;

    private String ldtype;

    private String ldmodey;

    private String idsum;

    private String idmode;

    private String ldindate;

    private String ldoutdate;


    public Integer getLdid() {
        return ldid;
    }

    public void setLdid(Integer ldid) {
        this.ldid = ldid;
    }

    public Integer getIrid() {
        return irid;
    }

    public void setIrid(Integer irid) {
        this.irid = irid;
    }

    public Integer getBcid() {
        return bcid;
    }

    public void setBcid(Integer bcid) {
        this.bcid = bcid;
    }

    public String getRefoundcard() {
        return refoundcard;
    }

    public void setRefoundcard(String refoundcard) {
        this.refoundcard = refoundcard;
    }

    public String getRefoundbank() {
        return refoundbank;
    }

    public void setRefoundbank(String refoundbank) {
        this.refoundbank = refoundbank;
    }

    public String getLdtype() {
        return ldtype;
    }

    public void setLdtype(String ldtype) {
        this.ldtype = ldtype;
    }

    public String getLdmodey() {
        return ldmodey;
    }

    public void setLdmodey(String ldmodey) {
        this.ldmodey = ldmodey;
    }

    public String getIdsum() {
        return idsum;
    }

    public void setIdsum(String idsum) {
        this.idsum = idsum;
    }

    public String getIdmode() {
        return idmode;
    }

    public void setIdmode(String idmode) {
        this.idmode = idmode;
    }

    public String getLdindate() {
        return ldindate;
    }

    public void setLdindate(String ldindate) {
        this.ldindate = ldindate;
    }

    public String getLdoutdate() {
        return ldoutdate;
    }

    public void setLdoutdate(String ldoutdate) {
        this.ldoutdate = ldoutdate;
    }

}