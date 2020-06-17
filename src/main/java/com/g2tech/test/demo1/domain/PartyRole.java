package com.g2tech.test.demo1.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class PartyRole {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPartyrole() {
        return partyrole;
    }

    public void setPartyrole(String partyrole) {
        this.partyrole = partyrole;
    }

    public String getPartydesc() {
        return partydesc;
    }

    public void setPartydesc(String partydesc) {
        this.partydesc = partydesc;
    }

    private String partyrole;
    private String partydesc;

}
