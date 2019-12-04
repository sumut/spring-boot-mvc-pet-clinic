package com.sumutella.petclinic.springdatajpaservices;

import com.sumutella.petclinic.models.Visit;
import com.sumutella.petclinic.repositories.VisitRepository;
import com.sumutella.petclinic.services.VisitService;

import java.util.HashSet;
import java.util.Set;

/**
 * @author sumutella
 * @time 5:36 PM
 * @since 12/4/2019, Wed
 */
public class VisitServiceSpringDataJpa implements VisitService {

    private final VisitRepository visitRepository;

    public VisitServiceSpringDataJpa(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();
        visitRepository.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public Visit findById(Integer integer) {
        return visitRepository.findById(integer).orElse(null);
    }

    @Override
    public Visit save(Visit object) {
        return visitRepository.save(object);
    }

    @Override
    public void delete(Visit visit) {
        visitRepository.delete(visit);
    }

    @Override
    public void deleteById(Integer integer) {
        visitRepository.deleteById(integer);
    }
}
