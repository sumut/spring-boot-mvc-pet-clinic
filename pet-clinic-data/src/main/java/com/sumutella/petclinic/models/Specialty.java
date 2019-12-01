package com.sumutella.petclinic.models;

/**
 * @author sumutella
 * @time 10:02 PM
 * @since 11/30/2019, Sat
 */
public class Specialty extends BaseEntity {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
