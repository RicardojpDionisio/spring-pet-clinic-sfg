package guru.springframework.petclinicsfg.service;

import guru.springframework.petclinicsfg.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findByLastName(String lastName);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
