package com.sumutella.petclinic.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author sumutella
 * @time 2:28 PM
 * @since 11/27/2019, Wed
 */
public abstract class AbstractMapService<T, ID> {
    protected Map<ID, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

    T save(ID id, T object){
        map.put(id, object);
        return object;
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void delete(T object){
        map.entrySet().removeIf( idtEntry -> idtEntry.getValue().equals(object));
    }






}
