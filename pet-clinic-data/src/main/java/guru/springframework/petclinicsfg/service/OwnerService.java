package guru.springframework.petclinicsfg.service;

import guru.springframework.petclinicsfg.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById(Long id);

    Owner findByLastName(String lastName);

    Owner save (Owner owner);

    Set<Owner> findAll();
}
