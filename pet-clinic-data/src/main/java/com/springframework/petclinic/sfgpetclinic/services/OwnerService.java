package com.springframework.petclinic.sfgpetclinic.services;

import com.springframework.petclinic.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
   Owner findbyLastName(String lastname) ;
}
