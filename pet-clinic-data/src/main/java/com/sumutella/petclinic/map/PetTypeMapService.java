package com.sumutella.petclinic.map;

import com.sumutella.petclinic.models.PetType;
import com.sumutella.petclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author sumutella
 * @time 11:01 PM
 * @since 11/30/2019, Sat
 */
@Service
public class PetTypeMapService extends AbstractMapService<PetType, Integer> implements PetTypeService {
    @Override
    public Set<PetType> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        super.deleteById(id);
    }

    @Override
    public void delete(PetType petType) {
        super.delete(petType);
    }

    @Override
    public PetType save(PetType petType) {
        return super.save(petType);
    }

    @Override
    public PetType findById(Integer id) {
        return super.findById(id);
    }
}
