package com.springframework.petclinic.sfgpetclinic.map;

import com.springframework.petclinic.sfgpetclinic.model.Owner;
import com.springframework.petclinic.sfgpetclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Set<Owner> findall() {
        return super.findall_mp();
    }

    @Override
    public Owner findbyID(Long aLong) {
         return super.findbyID_mp(aLong) ;
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId() , object) ;
    }

    @Override
    public void deletebyID(Long id) {
        super.deletebyID_mp(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete_mp(object);
    }
}
