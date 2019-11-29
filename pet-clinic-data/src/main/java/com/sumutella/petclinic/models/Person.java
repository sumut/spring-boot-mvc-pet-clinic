package com.sumutella.petclinic.models;

/**
 * @author sumutella
 * @time 7:12 PM
 * @since 11/26/2019, Tue
 */
public class Person extends BaseEntity {

    private String fname;
    private String lname;

    public Person() {
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }
}
