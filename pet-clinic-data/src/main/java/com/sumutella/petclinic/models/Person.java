package com.sumutella.petclinic.models;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * @author sumutella
 * @time 7:12 PM
 * @since 11/26/2019, Tue
 */
@MappedSuperclass
public class Person extends BaseEntity {

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;

    public Person() {
    }

    public void setFirstName(String fname) {
        this.firstName = fname;
    }

    public void setLastName(String lname) {
        this.lastName = lname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
