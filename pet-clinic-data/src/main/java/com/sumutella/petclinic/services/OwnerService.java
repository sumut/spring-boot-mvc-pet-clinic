package com.sumutella.petclinic.services;

import com.sumutella.petclinic.models.Owner;

/**
 * @author sumutella
 * @time 11:00 AM
 * @since 11/27/2019, Wed
 */
public interface OwnerService extends CrudService<Owner, Integer> {

    Owner findByLname(String lname);

}
