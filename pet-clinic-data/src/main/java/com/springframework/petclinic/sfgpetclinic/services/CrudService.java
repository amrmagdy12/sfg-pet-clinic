package com.springframework.petclinic.sfgpetclinic.services;

import java.util.Set;

public interface CrudService<T, ID> {
    Set<T> findall();

    T findbyID(ID id);

    T save(T object);

    void deletebyID(ID id);

    void delete(T object);

}
