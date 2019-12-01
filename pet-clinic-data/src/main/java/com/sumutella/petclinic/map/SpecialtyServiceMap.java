package com.sumutella.petclinic.map;

import com.sumutella.petclinic.models.Speciality;
import com.sumutella.petclinic.services.SpecialtyService;

import java.util.Set;

/**
 * @author sumutella
 * @time 1:49 PM
 * @since 12/1/2019, Sun
 */
public class SpecialtyServiceMap extends AbstractMapService<Speciality, Integer>  implements SpecialtyService {
    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findById(Integer integer) {
        return super.findById(integer);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public void delete(Speciality speciality) {
        super.delete(speciality);
    }

    @Override
    public void deleteById(Integer integer) {
        super.deleteById(integer);
    }
}
