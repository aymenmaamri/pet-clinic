package guru.springframework.petclinic.services;

import guru.springframework.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet fidById(long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
