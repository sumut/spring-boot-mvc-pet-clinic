package com.sumutella.petclinic.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author sumutella
 * @time 7:13 PM
 * @since 11/26/2019, Tue
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "VETS")
public class Vet extends Person {
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "VET_SPECIALTIES", joinColumns = @JoinColumn(name = "vet_id"),
            inverseJoinColumns = @JoinColumn(name = "specialty_id"))
    private Set<Specialty> specialties = new HashSet<>();


}

