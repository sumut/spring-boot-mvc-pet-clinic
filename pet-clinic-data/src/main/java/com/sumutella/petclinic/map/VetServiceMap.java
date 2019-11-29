package com.sumutella.petclinic.map;

import com.sumutella.petclinic.models.Vet;
import com.sumutella.petclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author sumutella
 * @time 2:47 PM
 * @since 11/27/2019, Wed
 */
@Service
public class VetServiceMap extends AbstractMapService<Vet, Integer> implements VetService {
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
        return super.save(vet);
    }

    @Override
    public Vet findById(Integer id) {
        return super.findById(id);
    }
}
