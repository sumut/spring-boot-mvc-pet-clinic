package com.sumutella.petclinic.repositories;

import com.sumutella.petclinic.models.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * @author sumutella
 * @time 4:08 PM
 * @since 12/4/2019, Wed
 */
public interface PetTypeRepository extends CrudRepository<PetType, Integer> {
}
