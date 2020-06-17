package com.g2tech.test.demo1.domain;

public class Supplier {
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTaxno() {
        return taxno;
    }

    public void setTaxno(String taxno) {
        this.taxno = taxno;
    }

    public Long getOrderleadtime() {
        return orderleadtime;
    }

    public void setOrderleadtime(Long orderleadtime) {
        this.orderleadtime = orderleadtime;
    }

    private String taxno;
    private Long orderleadtime;


}
