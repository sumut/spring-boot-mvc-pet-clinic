package com.sumutella.petclinic.models;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author sumutella
 * @time 7:15 PM
 * @since 11/26/2019, Tue
 */
@Entity
@Table(name = "PET_TYPES")
public class PetType extends BaseEntity {
    private String name;


    public PetType() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
