package com.sumutella.petclinic.models;

import java.time.LocalDate;

/**
 * @author sumutella
 * @time 7:14 PM
 * @since 11/26/2019, Tue
 */
public class Pet extends BaseEntity {
    private PetType petType;
    private Owner owner;
    private LocalDate bdate;
    private String name;


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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
