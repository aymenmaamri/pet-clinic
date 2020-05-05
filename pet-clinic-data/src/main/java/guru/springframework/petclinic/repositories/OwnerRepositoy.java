package guru.springframework.petclinic.repositories;

import guru.springframework.petclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepositoy extends CrudRepository<Owner, Long> {

}
