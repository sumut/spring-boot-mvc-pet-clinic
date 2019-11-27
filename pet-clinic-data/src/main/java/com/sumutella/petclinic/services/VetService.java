package com.sumutella.petclinic.services;

import com.sumutella.petclinic.models.Vet;

import java.util.Set;

/**
 * @author sumutella
 * @time 11:04 AM
 * @since 11/27/2019, Wed
 */
public interface VetService {
    Vet findById(Integer id);
    Vet save(Vet vet);
    Set<Vet> findAll();

}
