package com.sumutella.petclinic.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;

/**
 * @author sumutella
 * @time 9:57 PM
 * @since 11/30/2019, Sat
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "VISITS")
public class Visit extends BaseEntity {
    private LocalDate localDate;
    private String description;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

}
