package com.sumutella.petclinic.services;

import java.util.Set;

/**
 * @author sumutella
 * @time 2:04 PM
 * @since 11/27/2019, Wed
 */
public interface CrudService <T, ID> {
    Set<T> findAll();
    T findById(ID id);
    T save(T object);
    void delete(T t);
    void deleteById(ID id);
}
