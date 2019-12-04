package com.sumutella.petclinic.repositories;

import com.sumutella.petclinic.models.Owner;
import org.springframework.data.repository.CrudRepository;

/**
 * @author sumutella
 * @time 4:07 PM
 * @since 12/4/2019, Wed
 */
public interface OwnerRepository extends CrudRepository<Owner, Integer> {
    Owner findByLastName(String lastName);
}
