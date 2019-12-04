package com.sumutella.petclinic.springdatajpaservices;

import com.sumutella.petclinic.models.Specialty;
import com.sumutella.petclinic.repositories.SpecialtyRepository;
import com.sumutella.petclinic.services.SpecialtyService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * @author sumutella
 * @time 5:13 PM
 * @since 12/4/2019, Wed
 */
@Service
@Profile("springdatajpa")
public class SpecialityServiceSpringDataJpa implements SpecialtyService {
    private final SpecialtyRepository specialtyRepository;

    public SpecialityServiceSpringDataJpa(SpecialtyRepository specialtyRepository) {
        this.specialtyRepository = specialtyRepository;
    }


    @Override
    public Set<Specialty> findAll() {
        Set<Specialty> specialties = new HashSet<>();
        specialtyRepository.findAll().forEach(specialties::add);
        return specialties;
    }

    @Override
    public Specialty findById(Integer integer) {
        return specialtyRepository.findById(integer).orElse(null);
    }

    @Override
    public Specialty save(Specialty object) {
        return specialtyRepository.save(object);
    }

    @Override
    public void delete(Specialty specialty) {
        specialtyRepository.delete(specialty);
    }

    @Override
    public void deleteById(Integer integer) {
        specialtyRepository.deleteById(integer);
    }
}
