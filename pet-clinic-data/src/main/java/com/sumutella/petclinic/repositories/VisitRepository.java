package com.sumutella.petclinic.repositories;

import com.sumutella.petclinic.models.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * @author sumutella
 * @time 4:10 PM
 * @since 12/4/2019, Wed
 */
public interface VisitRepository extends CrudRepository<Visit, Integer> {
}
