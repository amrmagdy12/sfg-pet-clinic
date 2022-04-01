package com.springframework.petclinic.sfgpetclinic.map;

import com.springframework.petclinic.sfgpetclinic.model.Pet;
import com.springframework.petclinic.sfgpetclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet,Long> implements CrudService<Pet , Long> {
    @Override
    public Set<Pet> findall() {
        return super.findall_mp() ;
    }

    @Override
    public Pet findbyID(Long aLong) {
        return super.findbyID_mp(aLong) ;
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId() ,object) ;
    }

    @Override
    public void deletebyID(Long aLong) {
        super.deletebyID_mp(aLong);
    }

    @Override
    public void delete(Pet object) {
        super.delete_mp(object);
    }
}
