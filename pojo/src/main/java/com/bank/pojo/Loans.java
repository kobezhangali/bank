package com.ali.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * (Loans)实体类
 *
 * @author makejava
 * @since 2020-12-10 16:05:21
 */
@Data
public class Loans implements Serializable {
    private static final long serialVersionUID = 775042319171822955L;

    private Integer loansid;

    private Integer irid;

    private Integer bcid;

    private String loanscard;

    private String lmoney;

    private String loanstype;

    private String bankc;

    private String loandate;

    private String duedate;


    public Integer getLoansid() {
        return loansid;
    }

    public void setLoansid(Integer loansid) {
        this.loansid = loansid;
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

    public String getLoanscard() {
        return loanscard;
    }

    public void setLoanscard(String loanscard) {
        this.loanscard = loanscard;
    }

    public String getLmoney() {
        return lmoney;
    }

    public void setLmoney(String lmoney) {
        this.lmoney = lmoney;
    }

    public String getLoanstype() {
        return loanstype;
    }

    public void setLoanstype(String loanstype) {
        this.loanstype = loanstype;
    }

    public String getBankc() {
        return bankc;
    }

    public void setBankc(String bankc) {
        this.bankc = bankc;
    }

    public String getLoandate() {
        return loandate;
    }

    public void setLoandate(String loandate) {
        this.loandate = loandate;
    }

    public String getDuedate() {
        return duedate;
    }

    public void setDuedate(String duedate) {
        this.duedate = duedate;
    }

}