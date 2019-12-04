package com.sumutella.petclinic.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
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
@Table(name = "OWNERS")
public class Owner extends Person {
    private String address;
    private String city;
    private String telephone;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Pet> pets = new HashSet<>();


}
