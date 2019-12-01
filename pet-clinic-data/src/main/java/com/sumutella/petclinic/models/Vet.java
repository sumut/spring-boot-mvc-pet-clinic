package com.sumutella.petclinic.models;

import java.util.HashSet;
import java.util.Set;

/**
 * @author sumutella
 * @time 7:13 PM
 * @since 11/26/2019, Tue
 */
public class Vet extends Person {
    private Set<Specialty> specialties = new HashSet<>();

    public Vet() {
    }

    public Set<Specialty> getSpecialties() {
        return specialties;
    }

    public void setSpecialties(Set<Specialty> specialties) {
        this.specialties = specialties;
    }
}

