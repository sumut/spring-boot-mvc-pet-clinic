package com.sumutella.petclinic.map;

import com.sumutella.petclinic.models.Pet;
import com.sumutella.petclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author sumutella
 * @time 2:44 PM
 * @since 11/27/2019, Wed
 */
@Service
public class PetServiceMap extends AbstractMapService<Pet, Integer> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }

    @Override
    public Pet save(Pet pet) {
        return super.save(pet);
    }

    @Override
    public Pet findById(Integer id) {
        return super.findById(id);
    }
}
