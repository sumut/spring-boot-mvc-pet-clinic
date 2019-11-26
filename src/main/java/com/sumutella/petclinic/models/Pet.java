package com.sumutella.petclinic.models;

import java.time.LocalDate;

/**
 * @author sumutella
 * @time 7:14 PM
 * @since 11/26/2019, Tue
 */
public class Pet {
    private PetType petType;
    private Owner owner;
    private LocalDate bdate;

    public Pet() {
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBdate() {
        return bdate;
    }

    public void setBdate(LocalDate bdate) {
        this.bdate = bdate;
    }
}
