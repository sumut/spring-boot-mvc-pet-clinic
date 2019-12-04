package com.sumutella.petclinic.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author sumutella
 * @time 7:15 PM
 * @since 11/26/2019, Tue
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "PET_TYPES")
public class PetType extends BaseEntity {
    private String name;

}
