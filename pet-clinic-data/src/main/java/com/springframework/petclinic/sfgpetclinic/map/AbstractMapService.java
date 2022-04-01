package com.springframework.petclinic.sfgpetclinic.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {
    protected Map<ID, T> mapobjs = new HashMap<>();

    T save(ID id, T object) {
        mapobjs.put(id, object);
        return object;
    }

    Set<T> findall_mp() {
        return new HashSet<>(mapobjs.values());
    }

    T findbyID_mp(ID id) {
        return mapobjs.get(id);
    }

    void deletebyID_mp(ID id) {
        mapobjs.remove(id);
    }
    void delete_mp(T object) {
        mapobjs.entrySet().removeIf(entry ->
                entry.getValue().equals(object)
        );
    }

}
