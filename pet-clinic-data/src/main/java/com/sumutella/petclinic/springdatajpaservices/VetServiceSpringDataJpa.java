package com.sumutella.petclinic.springdatajpaservices;

import com.sumutella.petclinic.models.Vet;
import com.sumutella.petclinic.repositories.VetRepository;
import com.sumutella.petclinic.services.VetService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * @author sumutella
 * @time 5:00 PM
 * @since 12/4/2019, Wed
 */
@Service
@Profile("springdatajpa")
public class VetServiceSpringDataJpa implements VetService {

    private final VetRepository vetRepository;

    public VetServiceSpringDataJpa(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }


    @Override
    public Set<Vet> findAll() {
        Set<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet findById(Integer integer) {
        return vetRepository.findById(integer).orElse(null);
    }

    @Override
    public Vet save(Vet object) {
        return vetRepository.save(object);
    }

    @Override
    public void delete(Vet vet) {
        vetRepository.delete(vet);
    }

    @Override
    public void deleteById(Integer integer) {
        vetRepository.deleteById(integer);
    }


}
