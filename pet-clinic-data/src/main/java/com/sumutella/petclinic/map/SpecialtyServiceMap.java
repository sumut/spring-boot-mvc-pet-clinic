package com.sumutella.petclinic.map;

import com.sumutella.petclinic.models.Specialty;
import com.sumutella.petclinic.services.SpecialtyService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author sumutella
 * @time 1:49 PM
 * @since 12/1/2019, Sun
 */
@Service
public class SpecialtyServiceMap extends AbstractMapService<Specialty, Integer>  implements SpecialtyService {
    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public Specialty findById(Integer integer) {
        return super.findById(integer);
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }

    @Override
    public void delete(Specialty specialty) {
        super.delete(specialty);
    }

    @Override
    public void deleteById(Integer integer) {
        super.deleteById(integer);
    }
}
