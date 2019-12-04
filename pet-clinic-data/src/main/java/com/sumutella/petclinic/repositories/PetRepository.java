package com.sumutella.petclinic.repositories;

import com.sumutella.petclinic.models.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * @author sumutella
 * @time 4:08 PM
 * @since 12/4/2019, Wed
 */
public interface PetRepository extends CrudRepository<Pet, Integer> {
}
