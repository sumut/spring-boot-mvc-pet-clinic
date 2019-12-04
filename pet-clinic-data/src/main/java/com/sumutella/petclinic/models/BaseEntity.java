package com.sumutella.petclinic.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * @author sumutella
 * @time 11:16 AM
 * @since 11/27/2019, Wed
 */
@Getter
@Setter
@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;



}
