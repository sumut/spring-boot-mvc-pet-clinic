package com.sumutella.petclinic.repositories;

import com.sumutella.petclinic.models.Vet;
import org.springframework.data.repository.CrudRepository;

/**
 * @author sumutella
 * @time 4:10 PM
 * @since 12/4/2019, Wed
 */
public interface VetRepository extends CrudRepository<Vet, Integer> {
}
