package com.sumutella.petclinic.repositories;

import com.sumutella.petclinic.models.Specialty;
import org.springframework.data.repository.CrudRepository;

/**
 * @author sumutella
 * @time 4:09 PM
 * @since 12/4/2019, Wed
 */
public interface SpecialtyRepository extends CrudRepository<Specialty, Integer> {
}
