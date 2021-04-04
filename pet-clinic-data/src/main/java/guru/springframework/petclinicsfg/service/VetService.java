package guru.springframework.petclinicsfg.service;

import guru.springframework.petclinicsfg.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findByLastName(String lastName);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
