package com.sumutella.petclinic.map;

import com.sumutella.petclinic.models.BaseEntity;

import java.util.*;

/**
 * @author sumutella
 * @time 2:28 PM
 * @since 11/27/2019, Wed
 */
public abstract class AbstractMapService<T extends BaseEntity, ID> {
    protected Map<Integer, T> map = new HashMap<>();

    Set<T> findAll(){
        return new HashSet<>(map.values());
    }

    T findById(ID id){
        return map.get(id);
    }

    T save( T object){
        if(object!=null){
            if (object.getId()== null){
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Object cannot be null");
        }
        return object;
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void delete(T object){
        map.entrySet().removeIf( idtEntry -> idtEntry.getValue().equals(object));
    }

    private Integer getNextId(){
        Integer id = null;
        try {
            id = Collections.max(map.keySet())+1;
        } catch (NoSuchElementException nsee){
            id = 1;
        }
        return id;
    }





}
