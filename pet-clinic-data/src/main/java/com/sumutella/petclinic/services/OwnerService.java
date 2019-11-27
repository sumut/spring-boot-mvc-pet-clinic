package com.sumutella.petclinic.services;

import com.sumutella.petclinic.models.Owner;

import java.util.Set;

/**
 * @author sumutella
 * @time 11:00 AM
 * @since 11/27/2019, Wed
 */
public interface OwnerService {

    Owner findByLname(String lname);
    Owner findById(Integer id);
    Owner save(Owner owner);
    Set<Owner> findAll();

}
