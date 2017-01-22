package br.com.migresc.membros.application;

import br.com.migresc.membros.model.Membro;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by bruno on 22/01/17.
 */
@RepositoryRestResource(collectionResourceRel = "membro", path = "membro")
public interface MembroRepository extends MongoRepository<Membro, Integer> {
}
