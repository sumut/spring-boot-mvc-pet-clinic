package com.sumutella.petclinic.springdatajpaservices;

import com.sumutella.petclinic.models.PetType;
import com.sumutella.petclinic.repositories.PetTypeRepository;
import com.sumutella.petclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * @author sumutella
 * @time 5:04 PM
 * @since 12/4/2019, Wed
 */
@Service
@Profile("springdatajpa")
public class PetTypeServiceSpringDataJpa implements PetTypeService {

    private final PetTypeRepository petTypeRepository;

    public PetTypeServiceSpringDataJpa(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }


    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypes = new HashSet<>();
        petTypeRepository.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public PetType findById(Integer integer) {
        return petTypeRepository.findById(integer).orElse(null);
    }

    @Override
    public PetType save(PetType object) {
        return petTypeRepository.save(object);
    }

    @Override
    public void delete(PetType petType) {
        petTypeRepository.delete(petType);
    }

    @Override
    public void deleteById(Integer integer) {
        petTypeRepository.deleteById(integer);
    }
}
