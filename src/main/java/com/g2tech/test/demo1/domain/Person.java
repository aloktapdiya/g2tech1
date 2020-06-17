package com.g2tech.test.demo1.domain;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "contactsapp")
public class Person implements Serializable, Comparable<Person> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")

    private String lastName;

    private String personRole;

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno;
    }

    private String areacode;
    private String pno;

    public Person() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPersonRole() {
        return personRole;
    }

    public void setPersonRole(String personRole) {
        this.personRole = personRole;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Person(String lastName, String areacode, String pno) {
        super();
        this.firstName = lastName;
        this.areacode = areacode;
        this.pno = pno;
    }

    public Person(Integer Id, String lastName, String areacode, String pno) {
        super();
        this.id = id;
        this.lastName = lastName;
        this.areacode = areacode;
        this.pno = pno;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", lastName=" + lastName + ", areacode=" + areacode + ", pno=" + pno + "]";
    }

    @Override
    public int compareTo(Person c) {

        return new Long(this.id).compareTo(c.getId());
    }

}