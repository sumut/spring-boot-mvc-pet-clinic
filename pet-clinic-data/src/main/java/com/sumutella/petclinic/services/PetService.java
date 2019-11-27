package com.sumutella.petclinic.services;

import com.sumutella.petclinic.models.Pet;

import java.util.Set;

/**
 * @author sumutella
 * @time 11:03 AM
 * @since 11/27/2019, Wed
 */
public interface PetService {
    Pet findById(Integer id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
