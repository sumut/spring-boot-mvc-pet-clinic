package com.sumutella.petclinic.springdatajpaservices;

import com.sumutella.petclinic.models.Owner;
import com.sumutella.petclinic.repositories.OwnerRepository;
import com.sumutella.petclinic.repositories.PetRepository;
import com.sumutella.petclinic.repositories.PetTypeRepository;
import com.sumutella.petclinic.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;


/**
 * @author sumutella
 * @time 4:37 PM
 * @since 12/4/2019, Wed
 */
@Service
@Profile("springdatajpa")
public class OwnerServiceSpringDataJpa implements OwnerService {
    private final OwnerRepository ownerRepository;
    private final PetRepository petRepository;
    private final PetTypeRepository petTypeRepository;

    public OwnerServiceSpringDataJpa(OwnerRepository ownerRepository, PetRepository petRepository, PetTypeRepository petTypeRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Owner findByLname(String lname) {
        return ownerRepository.findByLastName(lname);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner findById(Integer integer) {
        return ownerRepository.findById(integer).orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner owner) {
        ownerRepository.delete(owner);
    }

    @Override
    public void deleteById(Integer integer) {
        ownerRepository.deleteById(integer);
    }


}
