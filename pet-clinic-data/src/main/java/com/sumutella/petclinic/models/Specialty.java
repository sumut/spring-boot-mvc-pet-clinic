package com.sumutella.petclinic.models;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author sumutella
 * @time 10:02 PM
 * @since 11/30/2019, Sat
 */
@Entity
@Table(name = "SPECIALTIES")
public class Specialty extends BaseEntity {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
