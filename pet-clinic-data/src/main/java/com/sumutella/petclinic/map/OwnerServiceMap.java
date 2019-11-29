package com.sumutella.petclinic.map;

import com.sumutella.petclinic.models.Owner;
import com.sumutella.petclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author sumutella
 * @time 2:35 PM
 * @since 11/27/2019, Wed
 */

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Integer> implements OwnerService {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public Owner save(Owner owner) {
        return super.save(owner.getId(), owner);
    }

    @Override
    public Owner findById(Integer id) {
        return super.findById(id);
    }

    @Override
    public Owner findByLname(String lname) {
        return null;
    }
}
