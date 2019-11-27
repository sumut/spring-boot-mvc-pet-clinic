package com.sumutella.petclinic.models;

import java.io.Serializable;

/**
 * @author sumutella
 * @time 11:16 AM
 * @since 11/27/2019, Wed
 */
public class BaseEntity implements Serializable {
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
