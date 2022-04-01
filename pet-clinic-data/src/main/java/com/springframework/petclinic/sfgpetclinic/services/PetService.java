package com.springframework.petclinic.sfgpetclinic.services;

import com.springframework.petclinic.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetService extends CrudService<Pet,Long> {
}
