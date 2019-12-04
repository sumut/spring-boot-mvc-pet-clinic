package com.sumutella.petclinic.springdatajpaservices;

import com.sumutella.petclinic.models.Pet;
import com.sumutella.petclinic.repositories.PetRepository;
import com.sumutella.petclinic.services.PetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * @author sumutella
 * @time 5:10 PM
 * @since 12/4/2019, Wed
 */
@Service
@Profile("springdatajpa")
public class PetServiceSpringDataJpa implements PetService {
    private final PetRepository petRepository;

    public PetServiceSpringDataJpa(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>();
        petRepository.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public Pet findById(Integer integer) {
        return petRepository.findById(integer).orElse(null);
    }

    @Override
    public Pet save(Pet object) {
        return petRepository.save(object);
    }

    @Override
    public void delete(Pet pet) {
        petRepository.delete(pet);
    }

    @Override
    public void deleteById(Integer integer) {
        petRepository.deleteById(integer);
    }
}
