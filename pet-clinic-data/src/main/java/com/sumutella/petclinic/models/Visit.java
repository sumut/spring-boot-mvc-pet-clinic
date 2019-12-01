package com.sumutella.petclinic.models;

import java.time.LocalDate;

/**
 * @author sumutella
 * @time 9:57 PM
 * @since 11/30/2019, Sat
 */
public class Visit extends BaseEntity {
    private LocalDate localDate;
    private String description;
    private Pet pet;

    public Visit() {
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
