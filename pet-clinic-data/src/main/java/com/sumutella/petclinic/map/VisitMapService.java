package com.sumutella.petclinic.map;

import com.sumutella.petclinic.models.Visit;
import com.sumutella.petclinic.services.VisitService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author sumutella
 * @time 5:25 PM
 * @since 12/4/2019, Wed
 */
@Service
public class VisitMapService extends AbstractMapService<Visit, Integer> implements VisitService {
    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Visit t) {
        super.delete(t);
    }

    @Override
    public Visit save(Visit visit) {
        if (visit.getPet()==null || visit.getPet().getOwner() == null
            || visit.getPet().getId() == null){
            throw  new RuntimeException("invalid visit");
        }
        return super.save(visit);
    }

    @Override
    public Visit findById(Integer id) {
        return super.findById(id);
    }
}
