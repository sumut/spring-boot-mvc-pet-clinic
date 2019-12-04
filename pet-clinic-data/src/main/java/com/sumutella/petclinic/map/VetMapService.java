package com.sumutella.petclinic.map;

import com.sumutella.petclinic.models.Specialty;
import com.sumutella.petclinic.models.Vet;
import com.sumutella.petclinic.services.SpecialtyService;
import com.sumutella.petclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author sumutella
 * @time 2:47 PM
 * @since 11/27/2019, Wed
 */
@Service
public class VetMapService extends AbstractMapService<Vet, Integer> implements VetService {
    private SpecialtyService specialtyService;

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

    @Override
    public Vet save(Vet vet) {
        if (vet.getSpecialties().size()>0){
            vet.getSpecialties().forEach(specialty -> {
                if(specialty.getId() == null){
                    Specialty savedSpecialty = specialtyService.save(specialty);
                    savedSpecialty.setId(savedSpecialty.getId());
                }
            });
        }

        return super.save(vet);
    }

    @Override
    public Vet findById(Integer id) {
        return super.findById(id);
    }
}
