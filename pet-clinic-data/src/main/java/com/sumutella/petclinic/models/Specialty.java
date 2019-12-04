package com.sumutella.petclinic.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author sumutella
 * @time 10:02 PM
 * @since 11/30/2019, Sat
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "SPECIALTIES")
public class Specialty extends BaseEntity {
    private String description;

}
