package com.springframework.petclinic.sfgpetclinic.model;

public abstract class BaseEntity {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    Long id ;

}
