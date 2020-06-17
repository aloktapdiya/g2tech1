package com.g2tech.test.demo1.domain;

import java.util.Date;

public class Customer {


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCustno() {
        return custno;
    }

    public void setCustno(String custno) {
        this.custno = custno;
    }

    public Date getLastorderdate() {
        return lastorderdate;
    }

    public void setLastorderdate(Date lastorderdate) {
        this.lastorderdate = lastorderdate;
    }

    private long id;
    private String custno;
    private Date lastorderdate;

}
