package com.scau.hyskjf.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Member {
    private Long memid;

    private String memcer;

    private BigDecimal memcerid;

    private String memname;

    private String memsex;

    private Date membirth;

    private Integer memphone;

    private String mememail;

    private String memadress;

    public Long getMemid() {
        return memid;
    }

    public void setMemid(Long memid) {
        this.memid = memid;
    }

    public String getMemcer() {
        return memcer;
    }

    public void setMemcer(String memcer) {
        this.memcer = memcer;
    }

    public BigDecimal getMemcerid() {
        return memcerid;
    }

    public void setMemcerid(BigDecimal memcerid) {
        this.memcerid = memcerid;
    }

    public String getMemname() {
        return memname;
    }

    public void setMemname(String memname) {
        this.memname = memname;
    }

    public String getMemsex() {
        return memsex;
    }

    public void setMemsex(String memsex) {
        this.memsex = memsex;
    }

    public Date getMembirth() {
        return membirth;
    }

    public void setMembirth(Date membirth) {
        this.membirth = membirth;
    }

    public Integer getMemphone() {
        return memphone;
    }

    public void setMemphone(Integer memphone) {
        this.memphone = memphone;
    }

    public String getMememail() {
        return mememail;
    }

    public void setMememail(String mememail) {
        this.mememail = mememail;
    }

    public String getMemadress() {
        return memadress;
    }

    public void setMemadress(String memadress) {
        this.memadress = memadress;
    }
}